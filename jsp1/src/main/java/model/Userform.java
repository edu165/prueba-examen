package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Userform {

	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private String apellido;
	private Date fecha;
	private String email;
	private String telefono;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	

	public void setDateOfBirth(String dateOfBirth) {

		try {
			this.fecha = sdf.parse(dateOfBirth);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", apellido=" + apellido + ",  email=" + email + ",   telefono=" + telefono  + ",fecha=" + fecha + ", sdf=" + sdf + "]";
	}
	
	

}
