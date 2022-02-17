<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
	<label>First Name:</label>
	<form:input path="FirstName"/>
	<br>
	
	<label>Last Name:</label>
	<form:input path="LastName"/>
	<br>
	
	<label>Programming Language:</label>
	<label>Java</label><form:radiobutton path="language" value="Java"/>
	<label>Ruby</label><form:radiobutton path="language" value="Ruby"/>
	<label>C#</label><form:radiobutton path="language" value="C#"/>
	<label>Swift</label><form:radiobutton path="language" value="Swift "/>
	<br>
	
	<label>Operating System</label>
	<label>Windows</label><form:checkbox path="operatingSystem" value="Windows"/>
	<label>MacOS</label><form:checkbox path="operatingSystem" value="MacOS"/>
	<label>Linux</label><form:checkbox path="operatingSystem" value="Linux"/>
	<br>
	
	<label>Country:</label>
	<form:select path="country">
			<form:options items="${student.countryOption}"/>
	</form:select>
	<br>
	
	<input type="submit" value="Submit"> 
</form:form>
</body>
</html>