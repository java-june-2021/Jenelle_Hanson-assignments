<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ideas</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	<body>
		<h1>Create New Idea</h1>
		<form:form action="/ideas/new" method="POST" modelAttribute="idea">
		<p>
			<form:label path="iText">Content:</form:label>
			<form:errors path="iText"/>
			<form:input path="iText"/><!--This will connect to the model page name variable-->
		</p>
		
		<form:input type="hidden" path="user" value="${user__id}"/><!-- This connects to idea Controller in the post mapping for /new. the session that gets the user needs to match the variable name -->
		<button>Create</button>
		</form:form>
	</body>
</html>