package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
	
	DepartmentRepository repository;

	@Override
	public Department saveDepartment(Department department) {
		return repository.save(department);
		
	}
	
}
