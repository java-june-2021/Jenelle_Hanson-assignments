<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ideas</title>
	</head>
	<body>
		<h1><c:out value="${thisIdea.iText}"/></h1><!-- Select the property off the model -->
		
		<p>Created by: <c:out value="${user.name}"/></p>
		<a href="/ideas/${thisIdea.id}/edit">Edit</a><!-- Because we want this to display once we are able to select it using the model getOneIdea -->
		<a href="/ideas">Main</a>
	</body>
</html>