package com.jdbc.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDaoImplementer sdi = (StudentDaoImplementer) ctx.getBean("s1");
		
		System.out.println("------Records Creation Done--------" );
	      //sdi.create("Zara", 11);
	      //sdi.create("Nuha", 2);
	      //sdi.create("Ayan", 15);
	      
	      System.out.println("------Listing Multiple Records--------" );
	      List<Student1> students = sdi.listStudents();
	      
	      for(Student1 record : students) {
	          System.out.print("ID : " + record.getId() );
	          System.out.print(", Name : " + record.getName() );
	          System.out.println(", Age : " + record.getAge());
	       }
	      
	      System.out.println("----Updating Record with ID = 2 -----" );
	      sdi.update(2, 20);
	      
	      System.out.println("----Deleting Record with ID = 6 -----" );
	      sdi.delete(6);
	      
	      System.out.println("----Listing Record with ID = 2 -----" );
	      Student1 student = sdi.getStudent(2);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
	      
	      
	      

	}

}
