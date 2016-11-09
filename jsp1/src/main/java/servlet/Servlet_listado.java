package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Userform;
import repository.Repositorio;
public class Servlet_listado extends HttpServlet {
	
	private Repositorio servicio = new  Repositorio();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Userform> listAllUsers = servicio.searchAll();
		req.setAttribute("listAllUsers", listAllUsers);
		redirect(req,resp);
	}
	
	
	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/formfin.jsp");
		dispatcher.forward(req,resp);
	}
}