package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ConnectionH2;
import connection.ConnectionManager;

import model.Userform;
import model.assembler.UserAssembler;
import repository.Repositorio;
import service.Servicio;



public class bienvenida extends HttpServlet{
	
	private Servicio service = new Servicio();
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Userform user = service.assembleUserFromRequest(req);
		service.insertOrUpdate(user);
		
		redirect(req,resp);
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("formfin/.jsp");
		dispatcher.forward(req,resp);
	}

	
	
	
	
}