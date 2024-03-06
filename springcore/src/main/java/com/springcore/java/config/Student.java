package com.springcore.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void study()
	{
		System.out.println("Hello from study");
	}

}
