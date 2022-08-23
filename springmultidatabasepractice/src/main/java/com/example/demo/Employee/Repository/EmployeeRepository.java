package com.example.demo.Employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	

}
