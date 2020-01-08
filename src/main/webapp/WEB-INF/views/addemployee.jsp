<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add employee</title>
<style type="text/css">
.container {
	margin: 50px;
	margin-left: 150px;
}

.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Add New Employee</h1>
		<form:form method="post" action="/CRUD/employee/saveemployee"
			modelAttribute="emp">
			<table>
				<tr>
					<td>Name :</td>
					<td><form:input path="employeeName" /></td>
					<td><form:errors path="employeeName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input path="employeeAge" /></td>
					<td><form:errors path="employeeAge" cssClass="error" /></td>

				</tr>
				<tr>
					<td>Designation :</td>
					<td><form:input path="employeeDesignation" /></td>
					<td><form:errors path="employeeDesignation" cssClass="error" /></td>

				</tr>
				<tr>
					<td>Salary :</td>
					<td><form:input path="employeeSalary" /></td>
					<td><form:errors path="employeeSalary" cssClass="error" /></td>

				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</form:form>
		<a href="/CRUD/employee/">View Employees</a>
	</div>
</body>
</html>