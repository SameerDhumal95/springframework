package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.spring.jdbc.springJdbc.Student;

public class RowMapperImpl implements org.springframework.jdbc.core.RowMapper<Student>{

	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAddress(rs.getString(3));
		return student;
	}

	
}
