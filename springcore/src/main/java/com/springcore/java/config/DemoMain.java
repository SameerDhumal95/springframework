package com.springcore.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spel.Demo;

public class DemoMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context  = new AnnotationConfigApplicationContext(javaconfig.class);
//		Student std = (Student)context.getBean("firststudent",Student.class);
//		System.out.println(std);
//		std.study();
		
		
		Student std = (Student)context.getBean("con",Student.class);
		System.out.println(std);
		std.study();
	}

}
