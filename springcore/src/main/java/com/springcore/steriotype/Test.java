package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/steriotype/sterioconfig.xml");
		// Prototype Scope using annotation
		Student student = context.getBean("ob",Student.class);
		System.out.println(student);
        System.out.println(student.getAddress());
        
        
        System.out.println(student.hashCode());
        
        Student student1 = context.getBean("ob",Student.class);
        System.out.println(student1.hashCode()); 
        
        
        
        
        //Prototype Scope using bean
        
        Teacher teacher = context.getBean("teacher",Teacher.class);
        System.out.println(teacher.hashCode()); 
        Teacher teacher1 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher1.hashCode());
	}

}
