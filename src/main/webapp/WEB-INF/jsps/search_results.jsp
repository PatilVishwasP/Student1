<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='1'>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		
		<c:forEach var="registration" items="${showRegister}">
		<tr>
			<td>${registration.firstName}</td>
			<td>${registration.lastName}</td>
			<td>${registration.email}</td>
			<td>${registration.mobile}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>