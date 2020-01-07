package com.musthafa.spring.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musthafa.spring.daos.EmployeeDao;
import com.musthafa.spring.models.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	@Autowired
	private EmployeeDao emp;

	public EmployeeDao getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDao emp) {
		this.emp = emp;
	}

	@Transactional
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emp.addEmployee(e);
	}

	@Transactional
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		emp.updateEmployee(e);
	}

	@Transactional
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return emp.listEmployees();
	}

	@Transactional
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return emp.getEmployeeById(id);
	}

	@Transactional
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		emp.removeEmployee(id);
	}
}
