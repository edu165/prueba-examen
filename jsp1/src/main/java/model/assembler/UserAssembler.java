package model.assembler;

import javax.servlet.http.HttpServletRequest;

import model.Userform;





public class UserAssembler {

	public static Userform assembleUserFrom(HttpServletRequest req) {
		Userform user = new Userform();
		String nombre = req.getParameter("name");
		String apellido = req.getParameter("apellido");
		String telefono = req.getParameter("telefono");
		String email = req.getParameter("email");
		String fecha = req.getParameter("dob");
		user.setNombre(nombre);
		user.setEmail(email);
		user.setDateOfBirth(fecha);
		user.setApellido(apellido);
		user.setTelefono(telefono);
		return user;
	}
}