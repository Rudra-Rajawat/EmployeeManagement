package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.service.EmployeeService;

@RestController /* @Controller + @ResponseBody */
@RequestMapping("/employees") // http://localhost:1234/employees
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/save") //http://localhost:1234/employees/save
	public String saveEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@PutMapping("/update") //http://localhost:1234/employees/update
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/deletebyId/{id}") //http://localhost:1234/employees/deletebyId
	public String deleteEmployee(@PathVariable("id") int empId) {
		return service.deleteEmployee(empId);
	}
	
	@GetMapping("/getById/{id}") //http://localhost:1234/employees/getById
	public Employee getEmployee(@PathVariable("id") int empId) throws EmployeeNotFound {
		return service.getEmployee(empId);
	}
	
	@GetMapping("/getAll") //http://localhost:1234/employees/getAll
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@GetMapping("/getAllBetween/{sal1}/{sal2}") //http://localhost:1234/employees/save
	public List<Employee> getAllBetween(@PathVariable("sal1") int initialSal,@PathVariable("sal2") int finalSal) {
		return service.getAllBetweenSalaries(initialSal,finalSal);
	}
	
	@GetMapping("/getAllByDesg/{desg}") //http://localhost:1234/employees/getAll
	public List<Employee> getAllByDesg(@PathVariable("desg") String desg) {
		return service.getAllByDesg(desg);
	}
}
