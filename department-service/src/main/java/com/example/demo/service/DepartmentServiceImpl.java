package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDept(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public Optional<Department> findByDeptId(int deptid) {
		
		return departmentRepository.findById(deptid);
	}

}
