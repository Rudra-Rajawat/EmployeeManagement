package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public String addEmployee(Employee employee) {
		Employee emp = repository.save(employee);
		if (emp != null) {
			return "Employee Saved Successfully";
		}
		else {
			return "Failed To Save Employee";
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = repository.save(employee);
		if (emp != null) {
			return emp;
		}
		else {
			return null;
		}
	}

	@Override
	public String deleteEmployee(int empId) {
		repository.deleteById(empId);;
		return "Employee deleted";
	}

	@Override
	public Employee getEmployee(int empId) throws EmployeeNotFound {
		Optional<Employee> optional = repository.findById(empId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			throw new EmployeeNotFound("No Employee Found With Given Id !!!!");
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public List<Employee> getAllBetweenSalaries(int intialSal, int finalSal) {
		return repository.getAllBetweenSalaries(intialSal,finalSal);
	}

	@Override
	public List<Employee> getAllByDesg(String desg) {
		return repository.getAllByDesg(desg);
	}

}
