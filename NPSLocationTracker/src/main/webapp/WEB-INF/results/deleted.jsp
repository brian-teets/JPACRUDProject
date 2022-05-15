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
		<h2>Deleted Location</h2>
		<c:choose>
			<c:when test="${deleted}">
				<h4>Successfully Deleted</h4>
			</c:when>
			<c:otherwise>
				<h4>Location was not deleted</h4>
			</c:otherwise>

		</c:choose>
		<p>
			<a href="home.do" class="btn btn-primary">Return to main page</a>
		</p>
	</div>


</body>
</html>