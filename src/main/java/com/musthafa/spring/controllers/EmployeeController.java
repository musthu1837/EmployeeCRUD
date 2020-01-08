package com.musthafa.spring.controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.musthafa.spring.models.Employee;
import com.musthafa.spring.services.EmployeeService;
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService model;

	public EmployeeService getModel() {
		return model;
	}

	public void setModel(EmployeeService model) {
		this.model = model;
	}

	@GetMapping("/")
	public String listEmployees(Model m) {
		m.addAttribute("listLength", model.listEmployees().size());
		m.addAttribute("list", model.listEmployees());
		return "employeelist";
	}

	@GetMapping("/addemployee")
	public String addEmployee(Model m) {
		m.addAttribute("emp", new Employee());
		return "addemployee";
	}
	@PostMapping("/saveemployee")
	public String saveEmployee(@ModelAttribute("emp") @Valid Employee emp,  BindingResult result, Model m) {
		if (result.hasErrors()) {
			m.addAttribute("emp", emp);
			System.out.println("musthafa");
            return "addemployee";
        }
		model.addEmployee(emp);
		return "saveemployee";
	}	
	@GetMapping("/deleteemployee/{id}")
	public String removeEmployee(@PathVariable String id) {
		model.removeEmployee(new Integer(id));
		return "deleteemployee";
	}

	@GetMapping("/editemployee/{id}")
	public String editEmployee(@PathVariable String id, Model m) {
		m.addAttribute("emp", model.getEmployeeById(new Integer(id)));
		return "editemployee";
	}
	@PostMapping("/updateemployee")
	public String updateEmployee(@ModelAttribute Employee e) {
		model.updateEmployee(e);
		return "updateemployee";
	}
}
