<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Edit Employee</h1>
		<form:form method="put" action="/CRUD/employee/${emp.employeeId}"
			modelAttribute="emp">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="employeeId" /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input path="employeeName"
							value="${emp.employeeName}" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input path="employeeAge" /></td>
				</tr>
				<tr>
					<td>Designation :</td>
					<td><form:input path="employeeDesignation" /></td>
				</tr>
				<tr>
					<td>Salary :</td>
					<td><form:input path="employeeSalary" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>