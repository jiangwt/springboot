package com.edu.spring.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringBootConfiguration;

//配置类
@SpringBootConfiguration
public class MyConfig {
	
	public List createList(){
		return new ArrayList();
	}

}
