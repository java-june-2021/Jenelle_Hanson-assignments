<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Task Manager</title>
	</head>
	<body>
		<div class="container">
			<h1>Welcome, <c:out value="${user.name}"/></h1>
			<table border = 1>
				<thead>
		        	<tr>
		            	<th>Task</th>
		            	<th>Creator</th>
		            	<th>Assignee</th>
		            	<th>Priority</th>
		        	</tr>
				</thead>
				<tbody>
		    		<c:forEach items="${allTasks}" var="tasks">
		    			<tr>
		    				<td><a href="/tasks/${tasks.id}"><c:out value="${tasks.tText}"/></a></td>
							<td><c:out value="${tasks.user.name}"/></td>
							<td><c:out value="${tasks.assignee}"/></td><!-- this has to pop-up a list of current users -->
							<td><c:out value="${tasks.priority}"></c:out></td><!-- this is your priority list of high med low might be a one to one** -->
						</tr>
		         	</c:forEach>
				</tbody>
			</table>
		    <a href="/tasks/new">Create Task</a>
		</div>
	</body>
</html>