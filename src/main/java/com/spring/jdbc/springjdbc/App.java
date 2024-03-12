// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.dao.StudentDaoImpl;
import com.spring.jdbc.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao sd = context.getBean("studentDao",StudentDao.class);
		
		/*
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Aryan Shrigod");
		s1.setCity("Gandhinagar");
		
		int result = sd.insert(s1);
		System.out.println("student inserted : " + result);
		*/
		
		/*
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Dhruv Patel");
		s1.setCity("Ahmedabad");
		int result = sd.change(s1);
		System.out.println("updated student : " + result);
		*/
		
		/*
		int result = sd.delete(2);
		System.out.println("deleted student : " + result);
		*/
		
		/* Code with try catch for the situations where there is a possibility of Id does not exist 
		try {
			Student student = sd.getStudent(2);
			System.out.println(student);
		} catch (Exception e) {
			System.out.println("Sorry Id does not exist");
		}
		System.out.println("Graceful termination");
		*/
		
		/* Simple student data fetching where we have guarantee that id exists.
		Student student = sd.getStudent(2);
		System.out.println(student);
		*/
		
		/*
		List<Student> students = sd.getAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}
		*/
		
		/*
		List<Object[]> list = ((StudentDaoImpl)sd).customizedQueries();
		for(Object[] s : list) {
			for(int i=0;i<=s.length-1;i++) {
				System.out.print(s[i] + " - ");
			}
			System.out.println();
		}
		*/
		
		Student st = new Student();
		st.setId(9);
		st.setName("Mihir Raval");
		st.setCity("Gandhinagar");
		st.setCourseId(11);
		boolean result = sd.insertUsingPreparedStatement(st);
		System.out.println("student inserted : " + result);
		
	}
}
