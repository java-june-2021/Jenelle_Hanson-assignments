<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<table border = 1><!-- don't leave this here put in css file -->
		<thead>
		        <tr>
		            <th>Title</th>
		            <td><c:out value="${thisSong.title}"/></td>
		        </tr>
		        <tr>
		            <th>Artist</th>
		            <td><c:out value="${thisSong.artist}"/></td>                                       
		        </tr>
		        <tr>		            
		            <th>Rating (1-10)</th>
		            <td><c:out value="${thisSong.rating}"/></td>
		        </tr>
		</thead>
	</table>
		
	<form method="POST" action="/delete/${thisSong.id}">
		<input type="hidden" name="_method" value="delete">
		<button>Delete Language</button>
	</form>
		
</body>
</html>