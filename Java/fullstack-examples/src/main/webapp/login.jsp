<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Login Form</h3>
	<form action = "LoginServlet" method = "post">
		<p>
			UserId <input type = "text" name = "id">
		</p>
		<p>
			Password <input type = "password" name = "password">
		</p>
		
		<p>
			<input type = "submit" value = "submit">
		</p>
	</form>
</body>
</html>