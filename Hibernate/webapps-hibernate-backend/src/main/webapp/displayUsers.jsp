<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Displays all the users</h2>
	
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	
	<ol>
		<c:forEach var="item" items="${k}">
			<li>Id: ${item.userId}, Name: ${item.name}, Password: ${item.password}, Phone: ${item.phoneNumber}</li>
		</c:forEach>
	</ol>
	
</body>
</html>