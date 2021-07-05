<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="style.css">
		<script src="theCode.js"></script>
		<title>theCode</title>
	</head>
	<body>	
		<h1>What is the code?</h1>
		<p>
			<c:out value="${errors}"/>
			<form method="POST" action="/submit">
				<input type="text" name="submit" required minlength="4" maxlength="8" size="10">
				<button>Try Code</button>
			</form>
			
		</p>
	</body>
</html>