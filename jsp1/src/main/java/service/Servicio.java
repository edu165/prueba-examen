package service;
import javax.servlet.http.HttpServletRequest;

import connection.ConnectionH2;
import connection.ConnectionManager;
import model.Userform;
import model.assembler.UserAssembler;
import repository.Repositorio;

public class Servicio {
	
	private Repositorio repository = new Repositorio();
	
	private ConnectionManager manager = new ConnectionH2();
	
	
	public Userform assembleUserFromRequest(HttpServletRequest req) {
		return UserAssembler.assembleUserFrom(req);
	}
	public void insertOrUpdate(Userform userFormulario) {
	
	
			repository.insert(userFormulario);
		
	}
	public ConnectionManager getManager() {
		return manager;
	}
	public void setManager(ConnectionManager manager) {
		this.manager = manager;
	}
}