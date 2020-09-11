<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Registration Form</h2>
	<form action = "FormHandlerServlet" method = "post">
		<p>
			Name <input type = "text" name = "name">
		</p>
		<p>
			Password <input type = "password" name = "password">
		</p>
		<p>
			DOB <input type = "text" name = "dob"> [Format: YYYY-MM-DD]
		</p>
		<p>
			Phone <input type = "text" name = "phone">
		</p>
		<p>
			<input type = "submit" value = "Register">
			<input type = "reset" value = "Reset">
			
		</p>
	</form>
</body>
</html>