package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/steriotype/sterioconfig.xml");
        
		Student student = context.getBean("ob",Student.class);
		System.out.println(student);
        System.out.println(student.getAddress());
	}

}
