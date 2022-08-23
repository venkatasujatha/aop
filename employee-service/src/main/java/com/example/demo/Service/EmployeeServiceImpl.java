package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmp() {
		return employeeRepository.findAll();
		
	}

	@Override
	public Object saveEmp(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Object getEmpId(int empid) {
		
		return employeeRepository.findById(empid);
	}
	

}
