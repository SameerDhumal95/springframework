package com.springcore.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
@Value("Sameer Dhumal")
private String studentName;
@Value("Pen")
private String City;

@Value("#{temp}")
private List<String> address;

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", City=" + City + "]";
}

}
