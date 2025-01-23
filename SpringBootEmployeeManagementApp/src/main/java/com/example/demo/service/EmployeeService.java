package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public interface EmployeeService {
	String addEmployee(Employee employee);
}
