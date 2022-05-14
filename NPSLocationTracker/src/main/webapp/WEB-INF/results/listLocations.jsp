<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Locations Results</title>
<jsp:include page="../bootStrapHead.jsp"/>
</head>
<body>
<div>
<h2>List of Locations Results</h2>
<c:choose>
			<c:when test="${! empty locations}">
<table>
		<thead>
			<tr>
				<th>Name</th> 
				<th>Visited?</th> 
				<th>Date Visited</th> 
				<th>State</th> 
				<th>Region</th> 
				<th>Description</th> 
			</tr>
		</thead> 
		<tbody>
			<c:forEach var="nps" items="${locations}">  <!-- items map to:  -->
				<tr>
					<td>${nps.name}</td>
					<td>${nps.hasVisited}</td>
					<td>${nps.dateVisited}</td>
					<td>${nps.state}</td>
					<td>${nps.description}</td> 
				</tr>
			</c:forEach> 
		</tbody>
	</table>
	</c:when>
	<c:otherwise>
				<h5>No locations found based on search criteria.</h5>
			</c:otherwise>
	</c:choose>
	<p><a href="home.do">Return to main page</a></p>
</div>
</body>
</html>