package com.springcore.steriotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
@Value("Sameer Dhumal")
private String studentName;
@Value("Pen")
private String City;
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
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", City=" + City + "]";
}

}
