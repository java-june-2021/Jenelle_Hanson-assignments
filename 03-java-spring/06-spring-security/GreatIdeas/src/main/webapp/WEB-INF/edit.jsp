<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ideas</title>
	</head>
	<body>
		<h1>Edit: <c:out value="${thisIdea.iText}"/></h1>
		
		<form:form action="/ideas/${thisIdea.id}/edit" method="POST" modelAttribute="thisIdea">
			<p>
				<form:label path="iText">Content:</form:label>
				<form:errors path="iText"/>
				<form:input path="iText"/><!--This will connect to the model page name variable-->
			</p>
			<form:input type="hidden" path="user" name="_method" value="${user__id}"/><!-- This connects to idea Controller in the post mapping for /new. the session that gets the user needs to match the variable name -->
			<input type="hidden" name="_method" value="put">
			<button>Update</button>
		</form:form>
		
		<a href="/ideas/delete/${thisIdea.id}">Delete</a>
	</body>
</html>