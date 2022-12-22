<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H1>Login Page: ${msg}</H1>
	<form action="/demo-1.0/login/" method = "post">		
		<input type = "text" id = "username" name = "username"/>
		<input type = "text" id = "email" name = "email"/>
		<input type = "submit" value = "Login"/>
	</form>
	<br/>
	<b>User Info: 	${user.email}</b>
</body>
</html>