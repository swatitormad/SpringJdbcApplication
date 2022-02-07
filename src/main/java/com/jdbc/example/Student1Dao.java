package com.jdbc.example;

import java.util.List;

import javax.sql.DataSource;

public interface Student1Dao {
	public void setDataSource(DataSource dataSource);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String name, Integer age);
	   
	   /** 
	      * This is the method to be used to list down
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public Student1 getStudent(Integer id);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<Student1> listStudents();
	   
	   /** 
	      * This is the method to be used to delete
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public void delete(Integer id);
	   
	   /** 
	      * This is the method to be used to update
	      * a record into the Student table.
	   */
	   public void update(Integer id, Integer age);

}
