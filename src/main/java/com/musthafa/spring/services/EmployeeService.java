package com.musthafa.spring.services;

import java.util.List;

import com.musthafa.spring.models.Employee;

public interface EmployeeService {
	public int addEmployee(Employee e);

	public int updateEmployee(Employee e);

	public List<Employee> listEmployees();

	public Employee getEmployeeById(int id);

	public int removePhone(int id);

}
