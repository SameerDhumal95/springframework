package com.springcore.ci;

public class Person {

	private String personName;
	private int personId;
	private Certi certi;
	
	public Person(String name,int id,Certi certi)
	{
		this.personName=name;
		this.personId=id;
		this.certi=certi;
	}


	@Override
	public String toString() {
		return this.personName+" : "+this.personId+" {"+this.certi+"}";
	}
	
	
}