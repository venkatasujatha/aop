package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;

@RestController
public class ClassController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/find1")
	public List<Employee> FindEmployee()
	{
		return employeeRepository.getEmployeeInfo();
	}
	@GetMapping("/findbyemployee/{catagory}")
	public List<Employee> finEmployeesByCatagory(@PathVariable String Catagory)
	{
		return (List<Employee>) employeeRepository.getEmployeeInfoByCategory(Catagory);
	}
	
}
