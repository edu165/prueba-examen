package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;



import connection.ConnectionH2;
import connection.ConnectionManager;


import model.Userform;

public class Repositorio {
	ConnectionManager manager = new ConnectionH2();
	private static final String jdbcUrl = "jdbc:h2:file:./src/main/resources/test2";
	private void close(PreparedStatement prepareStatement) {
		try {
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	private void close(ResultSet resultSet) {
		try {
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public void insert(Userform userFormulario) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn.prepareStatement("INSERT INTO Formulario (nombre, apellido, email, fecha, telefono)" +
					"VALUES (?, ?, ?, ?, ?)");
			preparedStatement.setString(1, userFormulario.getNombre());
			preparedStatement.setString(2, userFormulario.getApellido());
			preparedStatement.setString(3, userFormulario.getEmail());
			preparedStatement.setDate(4, new java.sql.Date(userFormulario.getFecha().getTime()));
			preparedStatement.setString(5, userFormulario.getTelefono());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(preparedStatement);
		}
		
		
		manager.close(conn);
	}
	public List<Userform> searchAll() {
		List<Userform> listUsers= new ArrayList<Userform>();
		Connection conn = manager.open(jdbcUrl);
		ResultSet resultSet = null;
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM Formulario");
			resultSet = prepareStatement.executeQuery();
			while(resultSet.next()){
				Userform userInDatabase = new Userform();
				userInDatabase.setNombre(resultSet.getString(1));
				userInDatabase.setApellido(resultSet.getString(2));
				userInDatabase.setEmail(resultSet.getString(3));
				userInDatabase.setTelefono(resultSet.getString(4));
				
				userInDatabase.setDateOfBirth(resultSet.getString(5));
				
				listUsers.add(userInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(resultSet);
			close(prepareStatement);
		}
		
		
		manager.close(conn);
		return listUsers;
	}
	
}