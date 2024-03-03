package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
        
		Person p = (Person)context.getBean("person1");
		System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());
        System.out.println("____________________");
        System.out.println(p.getFeestructure());
        System.out.println(p.getFeestructure().getClass().getName());
        System.out.println("____________________");
        System.out.println(p.getProps());
        System.out.println(p.getProps().getClass().getName());
	}

}
