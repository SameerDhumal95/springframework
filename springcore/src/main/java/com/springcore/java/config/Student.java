package com.springcore.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("firststudent")
//public class Student {
//
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public void study()
//	{
//		System.out.println("Hello from study");
//	}
//
//}


//this is without @Component Annotation
public class Student {

	
	private Samosa samosa;
	
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public void study()
	{
		this.samosa.display();;
		System.out.println("Student is reading book");
	}

	

}