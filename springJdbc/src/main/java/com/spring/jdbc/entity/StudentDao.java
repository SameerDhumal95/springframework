package com.spring.jdbc.entity;

import com.spring.jdbc.springJdbc.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(Student student);
	
}
