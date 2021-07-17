<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Languages</title>
	</head>
	<body>
		<h1>Welcome to Languages</h1>
		<table border = 1>
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
		        <c:forEach items="${allLanguages}" var="lang">
		        <tr>
		            <td><a href="/show/${lang.id}"><c:out value="${lang.name}"/></a></td>
		     		<td><c:out value="${lang.creator}"/></td>
		     		<td><c:out value="${lang.version}"/></td>
		            <td><a href="/edit/${lang.id}">Edit</a> | 
		            
		            <form method="POST" action="/delete/${lang.id}">
					<input type="hidden" name="_method" value="delete">
					<button>Delete Language</button>
					</form></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		
		
		<h2>Create New Language</h2>
		<form:form action="/" method="POST" modelAttribute="language">
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
		<button>Submit</button>
		</form:form>
	</body>
</html>