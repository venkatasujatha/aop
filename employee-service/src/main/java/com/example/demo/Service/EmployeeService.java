package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Employee;

public interface EmployeeService {

	List<Employee> getEmp();

	Object saveEmp(Employee employee);

	Object getEmpId(int empid);

}
