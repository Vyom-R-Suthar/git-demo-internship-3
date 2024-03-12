// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.entities.Student;

public class RowMapperImplForCustomizedQueryOnly implements RowMapper<Object[]> {

	public Object[] mapRow(ResultSet rs, int rowNum) throws SQLException {

		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();
		
		Object[] obj = new Object[columnCount];
		
		for(int i=0;i<=obj.length-1;i++) {
			obj[i] = rs.getObject(i+1);
		}
		
		return obj;
	}

}
