<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="/css/style.css">
		<title>Dojo Survey</title>
	</head>
	<body>
	<div class="wrapper">
		<table class="table">
			<tr>
			    <th>Name</th>
			    <td><c:out value="${name}"/></td>
			    </tr>
			<tr>
			    <th>Location</th>
			    <td><c:out value="${location}"/></td>
			</tr>
			<tr>
			   	<th>Language</th>
			    <td><c:out value="${language}"/></td>
			</tr>
			 <tr>
			    <th>Comment</th>
				<td><c:out value="${comment}"/></td>
			</tr>
		</table>
		
		<a href ="/"><button>Return to main</button></a>
	</div>
	</body>
</html>