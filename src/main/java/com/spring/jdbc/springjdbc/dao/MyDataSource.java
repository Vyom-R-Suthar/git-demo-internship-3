// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource extends DriverManagerDataSource{

	public MyDataSource() {
		super.setDriverClassName("com.mysql.cj.jdbc.Driver");
		super.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
		super.setUsername("root");
		super.setPassword("Kv139@mysql");
	}
	
	/*
	@Value("com.mysql.cj.jdbc.Driver")
	private String driverClassName;
	@Value("jdbc:mysql://localhost:3306/springjdbc1")
	private String url;
	@Value("root")
	private String username;
	@Value("Kv139@mysql")
	private String password;
	*/
	
	
}
