package com.spring.jdbc.entity;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.dao.RowMapperImpl;
import com.spring.jdbc.dao.StudentDao;
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

	
	
	public Student getStudent(int studentId) {
		//selecting single student data
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return students;
	}

	

	

	
	

}
