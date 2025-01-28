package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	DepartmentService service;
	
	@PostMapping("/save") //http://localhost:1234/department/save
	public Department saveDepartment(@RequestBody Department department) {
		return service.saveDepartment(department);
	}
}
