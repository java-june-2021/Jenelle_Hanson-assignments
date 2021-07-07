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
		<div class="form">
			<form method="POST" action="/submit">
				<label>Your Name: </label><input type="text" name="name" required minlength="4">
				
				<label>Dojo Location: </label>
				<select name="location">
  					<option value="Chicago">Chicago</option>
  					<option value="San Jose">San Jose</option>
  					<option value="New York">New York</option>
				</select>
				
				<label>Favorite Language: </label>
				<select name="language">
  					<option value="Javascript">JavaScript</option>
  					<option value="Python">Python</option>
  					<option value="Java">Java</option>
				</select>
				
				<label>Comment (optional): </label><textarea name="comment"></textarea>
				<button>Submit</button>
			</form>
		</div>
	</body>
</html>