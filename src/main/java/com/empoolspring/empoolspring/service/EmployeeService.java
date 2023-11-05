package com.empoolspring.empoolspring.service;

import java.util.List;

import com.empoolspring.empoolspring.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	Employee getEmployee(int employeeId);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int employeeId);
	
}
