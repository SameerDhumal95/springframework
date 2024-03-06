 package com.springcore.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages="com.springcore.java.config")
//public class javaconfig {
//
//	
//}

@Configuration
public class javaconfig {

	//creating a new student object
	@Bean
	public Student getStudent()
	{
		Student student = new Student(getSamosa());
		return student;
	}
	
	@Bean
	public Samosa getSamosa()
	{
		Samosa samosa = new Samosa();
		return samosa;
	}
}
