package com.edu.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("===afterPropertiesSet===");
	}

	public void destroy() throws Exception {
		System.out.println("===destroy=======");
	}
	
	

}
