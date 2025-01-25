package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFound;

@Service
public interface EmployeeService {
//	String addEmployee(Employee employee)/;
	public abstract String addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract String deleteEmployee(int empId);
	public abstract Employee getEmployee(int empId) throws EmployeeNotFound;
	public abstract List<Employee> getAllEmployee();
	public abstract List<Employee> getAllBetweenSalaries(int intialSal, int finalSal);
	public abstract List<Employee> getAllByDesg(String desg);

}
