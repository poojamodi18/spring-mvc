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
	<br><br>
	
	<label>Last Name*:</label>
	<form:input path="LastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	
	<label>Free Passes:</label>
	<form:input path="freePass"/>
	<form:errors path="freePass" cssClass="error"/>
	<br><br>
	
	<label>Postal Code:</label>
	<form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="error"/>
	<br><br>
	
	<input type="submit" value="Submit">
	&nbsp; 
	
</form:form>
<br>
<a href="/spring-mvc/home"><button>Home</button></a>
</body>
</html>