<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
	<h2>Add New Employee</h2>
	<f:form action="saveemployeetodb" modelAttribute="employee">
		Name <f:input path="name" />
		<br>
		Salary <f:input path="salary" />
		<br>
		Date Of Birth <f:input path="dateOfBirth" />
		<br>
		Department Id <f:input path="department.departmentId" />
		<br>
		Gender <f:input path="gender" />
		<br>
		State <f:input path="state" />
		<br>
		EmailId <f:input path="emailId" />
		<br>
		<input type="submit" value="Add Employee">
	</f:form>
</body>
</html>