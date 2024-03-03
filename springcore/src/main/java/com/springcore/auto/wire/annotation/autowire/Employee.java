package com.springcore.auto.wire.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	//@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
    //@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    @Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}
	
	
}
