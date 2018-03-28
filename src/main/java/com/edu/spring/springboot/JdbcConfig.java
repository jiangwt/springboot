package com.edu.spring.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {

	@Value("${url}")
	private String url;
	
	@Value("${driverClassName}")
	private String driverClassName;
	
	@Value("${redis.ip}")
	private String redisIp;
	
	public void show(){
		System.out.println("url:"+url);
		System.out.println("driverClass:"+driverClassName);
		System.out.println("redisIp:"+redisIp);
	}
	
}
