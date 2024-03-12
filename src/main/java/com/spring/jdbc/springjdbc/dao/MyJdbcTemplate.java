// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyJdbcTemplate extends JdbcTemplate{
	
	@Autowired
	private MyDataSource dataSource;

	public MyDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public MyJdbcTemplate(MyDataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public MyJdbcTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyJdbcTemplate(DataSource dataSource, boolean lazyInit) {
		super(dataSource, lazyInit);
		// TODO Auto-generated constructor stub
	}

	public MyJdbcTemplate(DataSource dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}
	
}
