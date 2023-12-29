package com;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class XMLClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		JdbcTemplate bean = context.getBean(JdbcTemplate.class);
//		bean.update("CREATE TABLE student(id int,name varchar(255),age int)");
//		bean.update("Insert into student values(1,'Nitish',22),(2,'Vinayaka',22),(3,'Sai',21),(4,'Virat',21)");
//		bean.update("update student set age=21 where id=1");
//		bean.query("select * from student", new MyStudentRowMapper());
		Object obj[]= {2};
//		List<Student> list = bean.query("select * from student where id=?", new StudentRowMapper(),obj );
//		System.out.println(list);
//		for(Object i:list) {
//			System.out.println(i);
//		}
//		Object[] obj1= {5,"Kohli",20};
//		int update = bean.update("insert into student values(?,?,?)",obj1);
//		System.out.println(update+" "+"done");
		Object [] obj2= {3};
		int update = bean.update("delete from student where id=?",obj2);
		System.out.println(update+" "+"done");
	}
}
