<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Artist</title>
	</head>
	<body>
		<div>
			<h2>All Songs By <c:out value="${artist}"/>:</h2>
			<form action="/search/artists">
				<input type="text" name="artist"/><!-- the second model attribute in string search is artist and is connected here for the button -->
				<button class="btn btn-primary">New Artist</button>
			</form>
			<a href="/dashboard">Dashboard</a>	
		</div>
		<table border = 1><!-- don't leave this here put in css file (border) -->
			<thead>
		        	<tr>
		            	<th>Title</th>
		            	<th>Artist</th>
		            	<th>Rating</th>
		            	<th>Action</th>
		        	</tr>
			</thead>
			<tbody>
		    	<c:forEach items="${allSongs}" var="song">
		        	<tr>
		            	<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
		     			<td><c:out value="${song.artist}"/></td>
						<td><c:out value="${song.rating}"/></td>
		            	<td>	
		            		<form method="POST" action="/delete/${song.id}">
								<input type="hidden" name="_method" value="delete">
								<button>Delete Language</button>
							</form>
						</td>
		    		</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>