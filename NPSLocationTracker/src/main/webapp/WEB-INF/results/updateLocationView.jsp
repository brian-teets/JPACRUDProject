<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update A Location</title>
<jsp:include page="../bootStrapHead.jsp" />
</head>
<body>
	
		<div class="container">
			<h2>Update A Location</h2>
			<div>
			<form action="updateLocation.do" method="POST">
			ID:  <input type="text" name="id" value="${location.id}" size="3" readonly/><br>

			NPS Location Name: <input type="text" name="name" size="25" value="${location.name}"/> <br>
			Visited?: <input type="checkbox" name="hasVisited" value="${location.hasVisited}"/> <br>
			
			Date Visited: <input type="date" name="date" value="${location.dateVisited}"/> <br>
			State: <input type="text" name="state" size="25" value="${location.state}"/> <br>
			Region: <input type="text" name="region" size="25" value="${location.region}"/> <br>
			NPS Designation: <input type="text" name="npsDesignation" size="25" value="${location.npsDesignation}"/> <br>
			Description: <input type="text" name="description" size="75" value="${location.description}"/> <br><br> 
			
			<input type="submit" value="Update Location" class="btn btn-primary">
			</form>
			</div>
			<p>
				<a href="home.do" class="btn btn-primary">Return to main page</a> 
			</p>
		</div>
		
	
</body>
</html>