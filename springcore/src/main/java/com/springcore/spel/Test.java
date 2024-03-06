package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class Test {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo temp = (Demo)context.getBean("demo");
		System.out.println(temp);
		
		//Expression Langauge
		SpelExpressionParser t = new SpelExpressionParser();
		Expression e = t.parseExpression("22+11");
		System.out.println(e.getValue());
	}

}
