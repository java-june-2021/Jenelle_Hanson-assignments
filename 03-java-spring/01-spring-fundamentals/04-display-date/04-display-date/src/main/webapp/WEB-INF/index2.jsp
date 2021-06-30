<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="displaydate.css">
		<script src="displaydate.js"></script>
		<title>Display Date</title>
	</head>
	<body>
		<script>alertPage("time")</script>
		<div class=green>
			<fmt:formatDate pattern="h:m a" value="${time}" />
			<a href="http://localhost:8080">Main Page</a>
		</div>
	</body>
</html>
