<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Hello Human</title>
	</head>
	<body>
		<h1>Hello <c:out value="${name}"/> <c:out value="${last}"/></h1>
		<p>Welcome to SpringBoot!</p>
	</body>
</html>