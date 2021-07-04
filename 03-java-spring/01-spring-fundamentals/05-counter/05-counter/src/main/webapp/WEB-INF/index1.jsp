<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="style.css">
		<script src="counter.js"></script>
		<title>Counter</title>
	</head>
	<body>	
		<h1>Counter</h1>
			You have visited localhost:8080 <c:out value="${count}"/> times.<br>
			<form method="POST" action="/reset">
				<input type="hidden" value="reset" name="reset">
				<button>Reset Counter</button>
			</form>
		
			<a href="http://localhost:8080">Return to Main page</a>
	</body>
</html>