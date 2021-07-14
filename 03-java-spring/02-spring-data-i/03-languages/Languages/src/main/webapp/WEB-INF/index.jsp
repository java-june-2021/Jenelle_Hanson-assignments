<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Languages</title>
	</head>
	<body>
	<h1>Welcome to Languages</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Language</th>
	            <th>Creator</th>
	            <th>Version</th>
	            <th>Action</th>
	        </tr>
	    </thead>
	    <tbody>
	    <!-- items variable: languages is connected to the controller variable must match table name in the model -->
	        <c:forEach items="${languages}" var="languages" varStatus="loop">
	        <tr>
	            <td><c:out value="${languages.name}"/></td>
	     		<td><c:out value="${languages.creator}"/></td>
	     		<td><c:out value="${languages.version}"/></td>
	            <td><a href="/language/edit/${languages.id}">Edit</a> | <a href="/language/${languages.id}">Delete</a></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<h2>Create New Language</h2>
	<p>
	<form:form action="/" method="POST" modelAttribute="languages">
	<form:label path="name">Name:</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	
	<form:label path="creator">Creator:</form:label>
	<form:errors path="creator"/>
	<form:input path="creator"/>
	
	<form:label path="version">Version:</form:label>
	<form:errors path="version"/>
	<form:input path="version"/>
	</form:form>
	</p>
	</body>
</html>

