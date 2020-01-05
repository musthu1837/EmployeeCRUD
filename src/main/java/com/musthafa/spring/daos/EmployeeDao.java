package com.musthafa.spring.daos;

import java.util.List;

import com.musthafa.spring.models.Employee;

public interface EmployeeDao {
	public int addEmployee(Employee e);

	public int updateEmployee(Employee e);

	public List<Employee> listEmployees();

	public Employee getEmployeeById(int id);

	public int removeEmployee(int id);
}
