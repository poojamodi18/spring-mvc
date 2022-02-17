<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
<div>
	<p>
		${student.firstName}  ${student.lastName}
		<br>
		Country : ${student.country}
		<br>
		Language : ${student.language}
		<br>
		Operating Systems : 
		<ul>
			<c:forEach var="os" items="${student.operatingSystem}"> 
				<li>${os}</li>
			</c:forEach>
		</ul>
	</p>
</div>
</body>
</html>