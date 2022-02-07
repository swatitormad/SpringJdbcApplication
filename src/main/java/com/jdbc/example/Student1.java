package com.jdbc.example;

public class Student1 {
	 private Integer age;
	   private String name;
	   private Integer id;
	   

	   public Student1() {
		super();
		System.out.println("In default");
	}
	   
	   
	public Student1(Integer age, String name, Integer id) {
		super();
		System.out.println("In param");
		this.age = age;
		this.name = name;
		this.id = id;
	}


	public void setAge(Integer age) {
		System.out.println("int setter");
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
	@Override
	public String toString() {
		return ("Age = " + age + " , Name  = " + name + " , Id = " + id );
	}

}
