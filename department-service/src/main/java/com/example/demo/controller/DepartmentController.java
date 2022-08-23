package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public Department saveDept(@RequestBody Department department)
	{
		return departmentService.saveDept(department);
	}
	
	@GetMapping("/get/{deptid}")
	public Optional<Department> findByDeptId(@PathVariable int deptid)
	{
		return departmentService.findByDeptId(deptid);
	}

}
