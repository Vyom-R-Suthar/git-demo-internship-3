// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mysql.cj.x.protobuf.MysqlxResultset.Row;
import com.spring.jdbc.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private MyJdbcTemplate template;

	public int insert(Student student) {
		String sql = "insert into student values(?,?,?)";
		int result = template.update(sql, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int change(Student student) {
		String sql = "update student set name=?, city=? where id=?";
		int result = template.update(sql, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(int studentId) {
		String sql = "delete from student where id=?";
		int result = template.update(sql, studentId);
		return result;
	}

	public Student getStudent(int studentId) {
		String sql = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = template.queryForObject(sql, rowMapper, studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		String sql = "select * from student";
		List<Student> students = template.query(sql, new RowMapperImpl());
		return students;
	}

	public List<Object[]> customizedQueries() {
		String sql = "select id,name,course_name from student,course where student.course_id = course.course_id and id <= ?";
		List<Object[]> students = template.query(sql, new RowMapperImplForCustomizedQueryOnly(),5);
		return students;
	}
	
	public boolean insertUsingPreparedStatement(final Student student) {
		String sql = "insert into student values(?,?,?,?)";
		boolean result = template.execute(sql,new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1,student.getId());
				ps.setString(2,student.getName());
				ps.setString(3, student.getCity());
				ps.setInt(4, student.getCourseId());
				return ps.execute();
			}
			
		});
		return result;
	}

	public MyJdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(MyJdbcTemplate template) {
		this.template = template;
	}

}
