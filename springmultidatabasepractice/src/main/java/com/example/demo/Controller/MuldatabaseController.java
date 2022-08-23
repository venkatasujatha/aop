package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee.Repository.EmployeeRepository;
import com.example.demo.Model.Employee.Employee;
import com.example.demo.Model.Office.Office;
import com.example.demo.Office.Repository.OfficeRepository;

@RestController
public class MuldatabaseController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private OfficeRepository officeRepository;
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping("/office")
	public List<Office> getOffice()
	{
		return officeRepository.findAll();
	}

}
