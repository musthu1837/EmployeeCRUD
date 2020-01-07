package com.musthafa.spring.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;
import com.musthafa.spring.models.Employee;
import com.musthafa.spring.services.EmployeeService;
import com.musthafa.spring.services.EmployeeServiceImplementation;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService model;

	public EmployeeService getModel() {
		return model;
	}

	public void setModel(EmployeeServiceImplementation model) {
		this.model = model;
	}

	@GetMapping("/")
	@ResponseBody
	public List<Employee> listEmployees() {
		return model.listEmployees();
	}

	@PostMapping("/")
	@ResponseBody
	public String addEmployee(@RequestBody Employee emp) {
		model.addEmployee(emp);
		return "{code: 201,message: 'success'}";
	}

	@DeleteMapping("/{id}")
	@ResponseBody
	public String removeEmployee(@PathVariable String id) {
		model.removeEmployee(new Integer(id));
		return "{code: 200,message: 'success'}";
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Employee getEmployee(@PathVariable String id) {
		return model.getEmployeeById(new Integer(id));
	}

	@PutMapping("/{id}")
	@ResponseBody
	public String updateEmployee(@RequestBody Employee emp) {
		model.updateEmployee(emp);
		return "{code: 200,message: 'success'}";
	}
}
