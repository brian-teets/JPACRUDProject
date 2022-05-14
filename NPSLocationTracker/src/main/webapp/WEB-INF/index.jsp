<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My NPS Tracker</title>
<jsp:include page="bootStrapHead.jsp"/>
</head>
<body>
<div>
	<h1>My NPS Tracker</h1>

	<form action="getLocation.do?npsid=${location.id}" method="GET">
		Location ID: <input type="text" name="npsid" size="3"> <input
			type="submit" value="Find Location">

	</form>
	</div>
	<div>
	<h5>Click the location name to view more details.</h5>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Visited</th>
				<th>State</th>
				<th>Region</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="nps" items="${locations}">
				<!-- items map to:  -->
				<tr>
					<td>${nps.id}</td>
					<td><a href="getLocation.do?npsid=${nps.id}">${nps.name} </a></td>
					<td>${nps.hasVisited}</td>
					<td>${nps.state}</td>
					<td>${nps.region}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>

</body>
</html>