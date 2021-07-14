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
	<h1>All Languages</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Language</th>
	        </tr>
	    </thead>
	    <tbody>
	    <!-- items variable: languages is connected to the controller variable must match table name in the model -->
	        <c:forEach items="${languages}" var="languages" varStatus="loop">
	        <tr>
	            <td><c:out value="${languages.name}"/></td>
	            <td><c:out value="${languages.creator}"/></td>
	            <td><c:out value="${languages.version}"/></td>
	            <td></td>
	            <td></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<a href="/language">Main Page</a>
	</body>
</html>
