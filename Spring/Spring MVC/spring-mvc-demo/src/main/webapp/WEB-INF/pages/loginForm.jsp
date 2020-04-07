<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "sf" %>
	<h2>Login Form</h2>
	<sf:form modelAttribute = "login" method = "POST" action = "authenticate">
		<label>Enter Username</label> <sf:input path="username" /> <br />
		<label>Enter Password</label> <sf:password path="password" /> <br />
		<input type = "submit" value = "Login">
	</sf:form>
</body>
</html>