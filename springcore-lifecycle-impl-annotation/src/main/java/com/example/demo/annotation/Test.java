package com.example.demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		Example bean = (Example) context.getBean("j1");
		System.out.println(bean);
		context.registerShutdownHook();

	}

}
