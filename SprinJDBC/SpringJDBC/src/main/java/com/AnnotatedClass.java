package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnotatedClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate bean = context.getBean(JdbcTemplate.class);
		Object[]obj= {7,"king",21,8,"rahul",17};
		int update = bean.update("insert into student values(?,?,?),(?,?,?)",obj);
		System.out.println(update+" "+"done");
	}
}
