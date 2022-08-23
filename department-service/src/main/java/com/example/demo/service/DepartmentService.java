package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Department;

public interface DepartmentService {

	Department saveDept(Department department);

	Optional<Department> findByDeptId(int deptid);

}
