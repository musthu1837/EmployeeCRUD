package com.musthafa.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musthafa.spring.daos.EmployeeDao;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeDao model;

	public EmployeeDao getModel() {
		return model;
	}

	public void setModel(EmployeeDao model) {
		this.model = model;
	}

	@PostMapping("/")
	public String listEmployees() {
		return "addemployee";
	}

	@GetMapping("/")
	public String addEmployee() {
		return "addemployee";
	}

	@DeleteMapping("/{id}")
	public String removeEmployee(@PathVariable String eid) {
		System.out.println(eid);
		return "removeemployee";
	}

	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable String eid) {
		System.out.println(eid);
		return "updateemployee";
	}
}
