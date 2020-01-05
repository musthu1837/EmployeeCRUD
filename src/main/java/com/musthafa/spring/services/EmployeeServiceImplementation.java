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
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public int removePhone(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
