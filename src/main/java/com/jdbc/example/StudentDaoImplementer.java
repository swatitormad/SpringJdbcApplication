package com.jdbc.example;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImplementer implements Student1Dao {
	private DataSource dataSource;
	private JdbcTemplate jd;
	public StudentDaoImplementer(){
		//new JdbcTemplate(ds);
	}
	public static void main(String[] args) {
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jd = new JdbcTemplate(dataSource);
		

	}

	public void create(String name, Integer age) {
	      String SQL = "insert into Student1 (name, age) values (?, ?)";
	      jd.update( SQL, name, age);
	      System.out.println("Created Record Name = " + name + " Age = " + age);
	      return;
	   }

	public Student1 getStudent(Integer id) {
	String query = "select * from Student1 where id = ?";
	Student1 obj = jd.queryForObject(query,new Object[] {id},new StudentMapper());
	
		return obj;
	}

	public List<Student1> listStudents() {
		String query = "select * from Student1";
		List<Student1> list = jd.query(query,new StudentMapper());
		return list;
	}

	public void delete(Integer id) {
		String query = "delete from Student1 where id = ?";
		jd.update(query, id);
		 System.out.println("Deleted Record with ID = " + id );
	      return;

	}

	public void update(Integer id, Integer age) {
		String SQL = "update Student1 set age = ? where id = ?";
	      jd.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;

	}

}
