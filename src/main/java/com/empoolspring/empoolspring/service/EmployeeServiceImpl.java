package com.empoolspring.empoolspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empoolspring.empoolspring.dao.EmployeeDao;
import com.empoolspring.empoolspring.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.getReferenceById(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeDao.delete(getEmployee(employeeId));
	}

}
