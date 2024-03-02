package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class Example  {

	 private String subject;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	@PostConstruct
	public void init()
	{
		System.out.println("Init");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Init");
	}
}
