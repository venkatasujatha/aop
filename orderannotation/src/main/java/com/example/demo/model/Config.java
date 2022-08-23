package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Employee;
import com.example.demo.model.Person;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class Config {
	
	@Autowired
	
	private List<Person> personList;
	
	@Bean
	public Person student1()
	{
		Person student1=new Student();
		student1.setName("sujatha");
		student1.setAge(22);
		//System.out.println(student1);
		return student1;
	}
	
	@Bean
	public Person student2()
	{
		Person student2=new Student();
		student2.setName("bharathi");
		student2.setAge(21);
		return student2;
	}
	
	@Bean
	public Person employee1()
	{
		Person employee1=new Employee();
		employee1.setName("bunny");
		employee1.setAge(24);
		return employee1;
	}
	
	@Bean
	public Person employee2()
	{
		Person employee2=new Employee();
		employee2.setName("dilip");
		employee2.setAge(20);
		return employee2;
	}
	
	@Bean
	public Person teacher1()
	{
		Person teacher1=new Teacher();
		teacher1.setName("fani");
		teacher1.setAge(28);
		return teacher1;
	}
	
	@Bean
	public Person teacher2()
	{
		Person teacher2=new Teacher();
		teacher2.setName("yamini");
		teacher2.setAge(27);
		return teacher2;
	}

	@Bean
	public void test()
	{
		System.out.println(personList);
	}
}
