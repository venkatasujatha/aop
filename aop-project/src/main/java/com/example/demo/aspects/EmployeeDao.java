package com.example.demo.aspects;

import java.util.Random;

import org.springframework.stereotype.Component;

//business class
@Component
public class EmployeeDao {
	
	@MyTx
	public String saveEmployee()
	{
		System.out.println("from save employee");
		
		/*
		 * if(new Random().nextInt(15)<=10) { throw new
		 * RuntimeException("Dummy Exception"); }
		 */
		return "hai";
		  
	}
	
	public String getAllEmployee()
	{
		System.out.println("from getall employee");
		
		/*
		 * if(new Random().nextInt(15)<=10) { throw new
		 * RuntimeException("Dummy Exception"); }
		 */
		return "hai";
		  
	} 

}
