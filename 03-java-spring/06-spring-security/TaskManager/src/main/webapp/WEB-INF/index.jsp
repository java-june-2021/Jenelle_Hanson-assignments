<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="ISO-8859-1">
		<title>Task Manager</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">			
			<div class="col">
				<h3>Register</h3>
					<form:form action="/register" method="post" modelAttribute="user">
						<div class="form-group">
							<form:label path="name">Name:</form:label>
							<form:errors path="name"/>
							<form:input class="form-control" path="name"/>
						</div>
						<div class="form-group">
							<form:label path="email">Email:</form:label>
							<form:errors path="email"/>
							<form:input type="email" class="form-control" path="email"/>
						</div>
						<div class="form-group">
							<form:label path="password">Password:</form:label>
							<form:errors path="password"/>
							<form:input type="password" class="form-control" path="password"/>
						</div>
						<div class="form-group">
							<form:label path="passwordConfirm">Password Conf:</form:label>
							<form:errors path="passwordConfirm"/>
							<form:input type="password" class="form-control" path="passwordConfirm"/>
						</div>
						<input class="btn btn-primary" type="submit" value="Register"/>
					</form:form>
			</div>
			
			<div class="row">
				<div class="col">
					<h3>Login</h3>
					<p>${loginError}</p>
					<form method="POST" action="/login">
						<div class="form-group">
							<label>Email:</label>
							<input type="email" name="lemail">
						</div>
						<div class="form-group">
							<label>Password:</label>
							<input type="password" name="lpassword">
						</div>
						<button>Login</button>
					</form>
				</div>
			</div>
			
		</div>
	</body>
</html>