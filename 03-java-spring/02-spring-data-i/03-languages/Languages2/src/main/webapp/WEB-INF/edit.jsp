<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Edit</title>
	</head>
	<body>
		<h1>Edit</h1>
		<form:form action="/edit/${language.id}" method="POST" modelAttribute="language">
		<p>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name"/><!--This will connect to the model page name variable-->
		</p>
		<p>
			<form:label path="creator">Creator:</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="version">Version:</form:label>
			<form:errors path="version"/>
			<form:input path="version"/>
		</p>
		
		<input type="hidden" name="_method" value="put">
		<button>Edit Language</button>
		</form:form>
	</body>
</html>