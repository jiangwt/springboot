package com.edu.spring.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("classpath:jdbc.properties")
@PropertySource("classpath:redis.properties")
//@PropertySources({@PropertySource("classpath:jdbc.properties"),
	//@PropertySource("classpath:redis.properties")})
public class FileConfig {

}
