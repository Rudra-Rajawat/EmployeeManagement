package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;

@Service
public interface DepartmentService {
	Department saveDepartment (Department department);
}
