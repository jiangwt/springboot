package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edu.spring.springboot.User;


public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(MyConfig.class,User.class);
	
		System.out.println(context.getBean(MyBean.class));
		
		System.out.println(context.getBean("createMyBean"));
		
//		System.out.println(context.getBean(Jeep.class));
		
		System.out.println(context.getBean(Cat.class));
		
		System.out.println(context.getBean(User.class));
		
		context.close();
	}
}
