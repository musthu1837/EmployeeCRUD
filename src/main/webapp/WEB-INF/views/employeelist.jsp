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

button {
	float: right;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Add New Employee</h1>
		<form:form method="post" action="save">

		</form:form>
		<h1>Employees List</h1>
		<a href="http://localhost:8080/CRUD/employee/">
			<button>Add employee</button>
		</a>
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
					<td><a href="editemp/${emp.employeeId}">Edit</a></td>
					<td><a href="deleteemp/${employeeId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<p>
			Returned <b>${listLength}</b> row(s).
		</p>
	</div>
</body>
</html>