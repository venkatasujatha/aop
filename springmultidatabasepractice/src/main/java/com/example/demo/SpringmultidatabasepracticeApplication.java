package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Employee.Repository.EmployeeRepository;
import com.example.demo.Model.Employee.Employee;
import com.example.demo.Model.Office.Office;
import com.example.demo.Office.Repository.OfficeRepository;

@SpringBootApplication()
public class SpringmultidatabasepracticeApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private OfficeRepository officeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringmultidatabasepracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		employeeRepository.saveAll(Arrays.asList(new Employee(102, "sujatha", "tech"),
				new Employee(103, "surya", "hr"),
				new Employee(104, "chand", "pmo")));
		
		officeRepository.saveAll(Arrays.asList(new Office(11, "tectoro", "hyderabad"),
				new Office(12, "tcs", "bangalore"),
				new Office(13, "novertech", "chennai")));
		
	}

}
