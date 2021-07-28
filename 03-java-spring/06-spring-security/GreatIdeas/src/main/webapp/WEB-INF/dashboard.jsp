<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ideas</title>
	</head>
	<body>
		<div class="container">
			<h1>Welcome, <c:out value="${user.name}"/></h1>
			<h3>Ideas</h3>
			<table border = 1>
				<thead>
		        	<tr>
		            	<th>Idea</th>
		            	<th>Created By:</th>
		            	<th>Likes</th>
		        	</tr>
				</thead>
				<tbody>
		    		<c:forEach items="${allIdeas}" var="ideas">
		    			<tr>
		    				<td><a href="/ideas/${ideas.id}"><c:out value="${ideas.iText}"/></a></td>
							<td><c:out value="${ideas.user.name}"/></td><!-- WTF!!!! how do i show the name of the user?? -->
							<td><c:out value="${ideas.usersWhoLiked.size()}"/></td>
						</tr>
		         	</c:forEach>
				</tbody>
			</table>
		    <a href="/ideas/new">Create Idea</a>
		</div>
	</body>
</html>