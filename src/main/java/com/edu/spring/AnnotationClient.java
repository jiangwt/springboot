package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edu.spring.springboot.User;

public class AnnotationClient {
	
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext("com.edu.spring");
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AnnotationScan.class);
		
		System.out.println(context.getBean(MyBean.class));
		
		System.out.println(context.getBean("createMyBean"));
		
//		System.out.println(context.getBean(Jeep.class));
		
		System.out.println(context.getBean(Cat.class));
		
		System.out.println(context.getBean(User.class));
		
		context.close();
		
	}

}
