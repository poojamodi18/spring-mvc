<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>

<style type="text/css">
.error{
	color: red; 
}
</style>

</head>
<body>
<form:form action="processForm" modelAttribute="customer">
	<label>First Name:</label>
	<form:input path="FirstName"/>
	<br>
	
	<label>Last Name*:</label>
	<form:input path="LastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br>
	
	<input type="submit" value="Submit"> 
</form:form>
</body>
</html>