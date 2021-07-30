<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Task: <c:out value="${thisTask.tText}"/></title>
	</head>
	<body>
		<h1><c:out value="${thisTask.tText}"/></h1><!-- Select the property off the model -->
		<p>Creator: <c:out value="${user.name}"/></p>
		<p>Assignee: <c:out value="${thisTask.assignee}"/></p>
		<p>Priority: <c:out value="${thisTask.priority}"/></p>
		
		<a href="/tasks/${thisTask.id}/edit">Edit</a><!-- Because we want this to display once we are able to select it using the model getOneIdea -->
		<a href="/tasks/delete/${thisTask.id}">Delete</a>
		<a href="/tasks">Main</a>
	</body>
</html>