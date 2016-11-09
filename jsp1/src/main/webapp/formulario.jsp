<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<form method="post" action="bienvenida">
	<table width="100%" align="center">
		<tr>
			<td colspan="2" align="center"><h2>Escriba su nombre</h2><hr></td>
		</tr>
		<tr>
			<td><p>Nombre:</p></td>
			<td><input type="text" id="user" name="name" size="30"></td>
		</tr>
		<tr>
			<td><p>Apellido:</p></td>
			<td><input type="text" id="apellido" name="apellido" size="30"></td>
		</tr>
		<tr>
			<td><p>Fecha Nacimiento:</p></td>
			<td><input type="date" id="edad" name="dob" size="30"></td>
		</tr>
		<tr>
			<td><p>Email:</p></td>
			<td><input type="text" id="email" name="email" size="30"></td>
			<td>
			<td><p>Telefono:</p></td>
			<td><input type="text" id="telefono" name="telefono" size="30"></td>
			<td>
				
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Enviar"></td>
		</tr>
	</table>
</form>