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
	<h2>Registration Form</h2>
	<sf:form modelAttribute="user" method = "post" action = "store">
		<label>Enter Name</label> <sf:input path="name"/> <br />
		<label>Enter Username</label> <sf:input path="username"/> <br />
		<label>Enter Password</label> <sf:password path="password"/> <br />
		<label>Enter Gender</label> <sf:input path="gender"/> <br />
		<input type = "submit" value = "Register">
	</sf:form>
	<h2>Update Password Form</h2>
	<form action = "update" method = "post">
		<label>Enter username </label> <input type = "text" name = "un"> <br />
		<label>Enter password </label> <input type = "password" name = "pw"> <br />
		<input type = "submit" value = "Update">
	</form>
	<h2>Search User</h2>
	<form action = "search" method = "post">
		<label>Enter username</label> <input type = "text" name = "user"> <br /> 
		<input type = "submit" value = "Search">
	</form>
	<a href = "allUsers">Show All Users</a>
	
</body>
</html>