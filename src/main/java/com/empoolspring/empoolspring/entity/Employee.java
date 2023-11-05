package com.empoolspring.empoolspring.entity;

import com.empoolspring.empoolspring.enums.EmployeeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String password;
	private EmployeeType employeeType;
	public Employee() {
	}
	public Employee(int id, String name, String email, String password, EmployeeType employeeType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.employeeType = employeeType;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeType getUserType() {
		return employeeType;
	}
	public void setUserType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
}
