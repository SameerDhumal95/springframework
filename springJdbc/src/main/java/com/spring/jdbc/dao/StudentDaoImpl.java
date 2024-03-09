package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.StudentDao;
import com.spring.jdbc.springJdbc.Student;

public class StudentDaoImpl implements StudentDao{
	
	//JdbcTemplate class from Spring
private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		String query = "insert into student(id,name,address) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return r;
	}

	@Override
	public int change(Student student) {
		String query = "update student set name=?,address=? where id =?";
        int r = this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return r;
	}
	
	@Override
	public int delete(Student student) {
		String query = "delete from student where id =?";
        int r = this.jdbcTemplate.update(query,student.getId());
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	
	

}
