package com.empoolspring.empoolspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empoolspring.empoolspring.entity.Employee;
import com.empoolspring.empoolspring.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "home page of my user application";
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees")
	public List<Employee> getUsers(){
		List<Employee> list = this.employeeService.getEmployees(); 
		return list;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getUser(@PathVariable String id) {
		try {
			return ResponseEntity.ok(this.employeeService.getEmployee(Integer.parseInt(id)));
		}
		catch (Exception e) {
		}
		return ResponseEntity.ofNullable(null);
	}

//	@PostMapping(path = "/employee", consumes = "application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable String id) {
		try {
			this.employeeService.deleteEmployee(Integer.parseInt(id));
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
