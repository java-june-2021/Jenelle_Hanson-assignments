<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Edit Task</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
<style>
	.drop{
    	margin: 0px;
    }
</style>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">	
	</head>
	<body>
		<h1>Edit: <c:out value="${thisTask.tText}"/></h1>
		
		<form:form action="/tasks/${thisTask.id}/edit" method="POST" modelAttribute="thisTask">
			<p>
				<form:label path="tText">Task:</form:label>
				<form:errors path="tText"/>
				<form:input path="tText"/><!--This will connect to the model page name variable-->
			</p>
			<div class="drop">
    			<div class="dropdown">
        			<a href="#" class="dropdown-toggle" data-toggle="dropdown">Assignee</a>
        			<div class="dropdown-menu">
            			<a href="#" class="dropdown-item">Action</a>
            			<a href="#" class="dropdown-item">Another action</a>
        			</div>
    			</div>
			</div>
			<p>
				<form:label path="assignee">Assignee:</form:label>
				<form:errors path="assignee"/>
				<form:input path="assignee"/><!--This will connect to the model page name variable-->
			</p>
			
			<div class="drop">
    		<div class="dropdown">
        		<a href="#" class="dropdown-toggle" data-toggle="dropdown">Priority</a>
        		<div class="dropdown-menu">
            		<a href="#" class="dropdown-item">High</a>
            		<a href="#" class="dropdown-item">Medium</a>
            		<a href="#" class="dropdown-item">Low</a>
        		</div>
    		</div>
			</div>
			<p>
				<form:label path="priority">Priority:</form:label>
				<form:errors path="priority"/>
				<form:input path="priority"/><!--This will connect to the model page name variable-->
			</p>
			
			
			<form:input type="hidden" path="user" name="_method" value="${user__id}"/><!-- This connects to idea Controller in the post mapping for /new. the session that gets the user needs to match the variable name -->
			<input type="hidden" name="_method" value="put">
			<button>Edit</button>
		</form:form>
		
		<a href="/ideas/delete/${thisTask.id}">Delete</a>
</body>
</html>