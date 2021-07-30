<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title></title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
<style>
	.drop{
    	margin: 0px;
    }
</style>
	</head>
	<body>
		<h1>Create New Task</h1>
		<form:form action="/tasks/new" method="POST" modelAttribute="task">
		<p>
			<form:label path="tText">Task:</form:label>
			<form:errors path="tText"/>
			<form:input path="tText"/><!--This will connect to the model page name variable-->
		</p>	
		<p>
			<form:label path="assignee">Assignee:</form:label>
				<form:errors path="assignee"/>
				<form:input path="assignee"/><!--This will connect to the model page name variable-->
		</p>
			
			<select class="form-select" aria-label="Default select example">
  				<option selected>Priority</option>
  				<option value="High">High</option>
  				<option value="Med">Med</option>
				<option value="Low">Low</option>
			</select>
		    
		<form:input type="hidden" path="user" value="${user__id}"/><!-- This connects to idea Controller in the post mapping for /new. the session that gets the user needs to match the variable name -->
		<button>Create</button>
		</form:form>
		
</body>
</html>