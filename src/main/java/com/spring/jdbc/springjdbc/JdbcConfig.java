// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.springjdbc.dao.StudentDao;
import com.spring.jdbc.springjdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.springjdbc.dao")
public class JdbcConfig {
	
	/*
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
		ds.setUsername("root");
		ds.setPassword("Kv139@mysql");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	*/
	/*
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl sd = new StudentDaoImpl();
		sd.setTemplate(getTemplate());
		return sd;
	}
	*/
}
