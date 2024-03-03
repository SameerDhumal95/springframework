package com.springcore.auto.wire.annotation;

public class Address {

	private String street;
	private String City;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		City = city;
		
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", City=" + City + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}
