package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Samosa s = (Samosa)context.getBean("samosa");
		System.out.println(s);
		//regesterShutdownhook method for destroy obj
		context.registerShutdownHook();
		System.out.println("----------------------");
		Pepsi p = (Pepsi)context.getBean("pepsi");
		System.out.println(p);
	}

	

}
