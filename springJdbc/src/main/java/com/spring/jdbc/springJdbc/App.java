package com.spring.jdbc.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My JDBC program..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
/*
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query = "insert into student(id,name,address) values(?,?,?)";
        
        //fire query
        int result = template.update(query,2,"Saurabh","Pune");
        System.out.println("Number of record inserted..  "+result);
*/
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
  /*      //Insert student
        Student student = new  Student();
        student.setId(75);
        student.setName("Bablu");
        student.setAddress("Mumbai");
         int result = studentDao.insert(student);
        System.out.println("Student inserted "+ result);
        
    */  
        
        /*      //update student      
        Student student = new  Student();
        student.setId(75);
        student.setName("Bablu");
        student.setAddress("US");
        
         int result = studentDao.change(student);
        System.out.println("Student updated "+ result);
     */
        Student student = new  Student();
        student.setId(75);
        int result = studentDao.delete(student);
        System.out.println("Student deleted "+ result);
        
       
    }
}
