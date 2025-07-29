<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee CRUD</title>
</head>
<body>
	<h1>Employee CRUD Application</h1>
	<br>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Date Of Birth</th>
			<th>Department Id</th>
			<th>Department Name</th>
			<th>Gender</th>
			<th>State</th>
			<th>Email</th>
		</tr>
		<c:forEach var="e" items="${employees}">
			<tr>
				<td>${e.employeeId}</td>
				<td>${e.name}</td>
				<td>${e.salary}</td>
				<td>${e.dateOfBirth}</td>
				<td>${e.department.departmentId}</td>
				<td>${e.department.departmentName}</td>
				<td>${e.gender}</td>
				<td>${e.state}</td>
				<td>${e.emailId}</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	<a href="newemployee">Add New Employee</a>
</body>
</html>




