package com.empoolspring.empoolspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empoolspring.empoolspring.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{}