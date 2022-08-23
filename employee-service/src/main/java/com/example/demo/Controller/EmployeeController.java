package com.example.demo.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get")
	public ResponseEntity<String> getEmp()
	{
		employeeService.getEmp();
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/saveemp")
	public Object saveEmp(@RequestBody Employee employee)
	{
		return employeeService.saveEmp(employee);
	}
	
	@GetMapping("/getbyid/{empid}")
	public Object getEmpId(@PathVariable int empid)
	{
		return employeeService.getEmpId(empid);
	}

}
