package com.edu.spring.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 两种获取配置的方法
 * 配置文件默认的文件名字为application.properties
 * 默认的位置在classpath根目录 或者classpath:/config
 * 
 * @author jiang
 *
 */
@Component
public class UserConfigs {
	
	@Value("${local.port}")
	private String localPort;
	
	@Value("${local.port}")
	private Integer localPort2;
	
	@Autowired
	private Environment env;
	
	public void show(){
		System.out.println("local.ip:"+env.getProperty("local.ip"));
		System.out.println("local.ip:"+localPort);
		System.out.println("local.ip:"+env.getProperty("name"));
		System.out.println("local.ip:"+env.getProperty("app.name"));
	}
	

}
