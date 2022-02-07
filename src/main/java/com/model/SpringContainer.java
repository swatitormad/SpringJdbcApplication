package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		Customer obj = (Customer)ctx.getBean("c1");
		System.out.println(obj);
		System.out.println("***********************************************");
		/* obj.setCname("KK"); it Takes same name for both
		it happens Egar loading when scope default is single tone
		but we take the scope in bean tag is prototype it makes a lazy laoding
		
		Customer obj1 = (Customer)ctx.getBean("c1");
		System.out.println(obj1);		
		
		both  points into single memory address 
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());*/
		
		Customer obj1 = (Customer)ctx.getBean("c2");
		System.out.println(obj1);
	}

}
