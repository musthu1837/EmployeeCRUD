<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
<style type="text/css">
.container {
	margin: 50px;
	margin-left: 150px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Add New Employee</h1>
		<form:form method="post" action="/CRUD/employee/" modelAttribute="emp">
			<table>
				<tr>
					<td>Name :</td>
					<td><form:input path="employeeName" /></td>
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
		<p>${message }</p>
		<h1>Employees List</h1>
		<table border="2" width="70%" cellpadding="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Designation</th>
				<th>Salary</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="emp" items="${list}">
				<tr>
					<td>${emp.employeeId}</td>
					<td>${emp.employeeName}</td>
					<td>${emp.employeeAge}</td>
					<td>${emp.employeeDesignation}</td>
					<td>${emp.employeeSalary}</td>
					<td align="center">
						<a href="/CRUD/employee/${emp.employeeId}">
							<button>
								Edit
							</button>
						</a>
					</td>
					<td align="center">
						<form:form method="delete" action="/CRUD/employee/${emp.employeeId}">
							<input type="submit" value="Delete" />
						</form:form>
					</td>
				</tr>
			</c:forEach>
		</table>
		<p>
			Returned <b>${listLength}</b> row(s).
		</p>
	</div>
</body>
</html>