<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Pagina final</title>
</head>
<body>
<table align="center">
<tr>
<td>Bienvenido:</td><td> <%= request.getParameter("nombre") %> </td><td> <%= request.getParameter("apellido") %> </td>

</tr>
<tr>
<td>Fecha Nacimiento  :</td><td> <%= request.getParameter("fecha") %> </td>
</tr>
<tr>
<td>Fecha Nacimiento  :</td><td> <%= request.getParameter("telefono") %> </td>
</tr>

<tr>
<td>Email:</td><td> <%= request.getParameter("email") %></td>
</tr>


	<tr>
	<td><input type="button" onclick="window.location.href='datos.jsp'"  value="Volver"></td>
<td><form action="verlistado" method="post">
	<input type="submit" value="formlistado"></form></td>
	<td>
	<form method="post" action="borrar">
	<input type="hidden" value="<%= request.getParameter("nombre") %>" name="user">
	
		<input type="submit"  value="Borrar"></td>
	</form>	
		</tr>
</table>

<table border="1">
	<thead>
		<tr>
			<td>Nombre</td>
			<td>Fecha</td>
			<td>Curso</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="user1" items="${listAllUsers}">
			<tr>
				<td><c:out value="${user1.nombre}"/> </td>
				<td><c:out value="${user1.fecha}"/> </td>
				<td><c:out value="${user1.apellido}"/> </td>
				<td><c:out value="${user1.email}"/> </td>
				<td><c:out value="${user1.telefono}"/> </td>
				<td><td><a name="user" href="borrar?user=${user1.nombre}">Borrar</a></td> </td>
	    	</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>