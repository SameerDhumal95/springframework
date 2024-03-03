package com.springcore.auto.wire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		Employee p =contex.getBean("emp",Employee.class);
		System.out.println(p);
	}

}
