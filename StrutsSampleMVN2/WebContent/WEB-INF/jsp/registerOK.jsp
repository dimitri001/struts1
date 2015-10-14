<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mi titulo</title>
</head>
<body>
	<h1>¡¡ Se ha registrado correctamente !!</h1>
	<h2>Datos de registro</h2>
	<ul>
		<li>Login: <bean:write name="registerUser" property="login"/></li>
		<li>Email: <bean:write name="registerUser" property="email"/></li>
		<li>Edad:  <bean:write name="registerUser" property="age"/></li>
	</ul>
</body>
</html>