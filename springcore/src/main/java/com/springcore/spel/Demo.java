package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Demo {

	@Value("#{22+11}")
	private int x;
	@Value("#{33*2}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double d;
	
	@Value("#{new java.lang.String('Sameer Dhumal')}")
	private String name;
	
	@Value("#{8-1>5}")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", d=" + d + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	

}
