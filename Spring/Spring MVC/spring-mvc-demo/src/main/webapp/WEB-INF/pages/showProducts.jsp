<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<h2>List of products</h2>
	<table>
		<tr>
			<td>Name</td><td>Price</td><td>Qty</td>
		</tr>
		<c:forEach items = "${products}" var="product">
			<tr>
				<td>${product.name}</td><td>${product.price}</td><td>${product.quantiy}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>