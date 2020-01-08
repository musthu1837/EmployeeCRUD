package com.musthafa.spring.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Size(min = 5, max = 20)
    @Pattern(regexp="[a-zA-Z]*[\\s]*[a-zA-Z]*",message="should contains only alphabet and one space")  
	@Column(name = "ename")
	private String employeeName;
	
	@Column(name = "eage")
    @Min(18) @Max(100)	
	private int employeeAge;
	
	@Size(min = 6, max = 20)
	@Pattern(regexp="[a-zA-Z]*",message="should contains only alphabet") 	
	@Column(name = "edesignation")
	private String employeeDesignation;
	
	@Min(10000)
	@Column(name = "esalary")
	private float employeeSalary;

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeeDesignation=" + employeeDesignation + ", employeeSalary=" + employeeSalary + "]";
	}

}
