package com.springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
Person p =(Person)contex.getBean("person");
System.out.println(p);

Addition add =(Addition)contex.getBean("addition");
add.doSum();
	
	}

}