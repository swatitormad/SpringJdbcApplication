package com.jdbc.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student1> {

	public static void main(String[] args) {

	}

	public Student1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student1 s = new Student1();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setAge(rs.getInt("age"));
		return s;
	}

}
