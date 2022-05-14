<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single Location Result</title>
<jsp:include page="../bootStrapHead.jsp"/>
</head>
<body>
<div>
<h2>Location Search Result</h2>
<table>
<tr>
	<td><strong>Name:</strong> ${location.name}</td>
	<td><strong>Visited?:</strong> ${location.hasVisited}</td>
	<td><strong>Date Visited:</strong> ${location.dateVisited}</td>
	<td><strong>State:</strong> ${location.state}</td>
	<td><strong>Region:</strong> ${location.region}</td>
	<td><strong>Description:</strong> ${location.description}</td> 
</tr>
</table>
<p><a href="home.do">Return to main page</a></p>
 </div>

</body>
</html>