package com.musthafa.spring.controllers;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.musthafa.spring.daos.EmployeeDao;
import com.musthafa.spring.models.Employee;
@Controller
@EnableTransactionManagement
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
	@Transactional
	public String listEmployees(@ModelAttribute("person") Employee e) {
		model.addEmployee(e);
		return "employeelist";
	}

	@GetMapping("/")
	@Transactional
	public String addEmployee(Model m) {
		m.addAttribute("listLength", model.listEmployees().size());
		m.addAttribute("list", model.listEmployees());
		return "employeelist";
	}

	@DeleteMapping("/{id}")
	@Transactional
	public String removeEmployee(@PathVariable String eid) {
		System.out.println(eid);
		return "removeemployee";
	}

	@PutMapping("/{id}")
	@Transactional
	public String updateEmployee(@PathVariable String eid) {
		System.out.println(eid);
		return "updateemployee";
	}
}
