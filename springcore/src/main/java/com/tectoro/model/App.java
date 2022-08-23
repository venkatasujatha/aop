package com.tectoro.model;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		ApplicationContext	factory = new ClassPathXmlApplicationContext("Config.xml");
		Student student=(Student) factory.getBean("student1");
		System.out.println(student);
	}

}
