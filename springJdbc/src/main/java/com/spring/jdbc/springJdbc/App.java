package com.spring.jdbc.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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

        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query = "insert into student(id,name,address) values(?,?,?)";
        
        //fire query
        int result = template.update(query,2,"Saurabh","Pune");
        System.out.println("Number of record inserted..  "+result);
    }
}
