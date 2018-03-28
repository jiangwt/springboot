package com.edu.spring.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * spring容器类
 * @author jiangwt02
 *
 */
@SpringBootApplication
public class App {
	
	@Bean
	public Runnable createRunnable(){
		return new Runnable(){
			public void run() {
				System.out.println("spring boot is running");
		}};
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run
				(App.class, args);
		
//		System.out.println(context.getEnvironment().getProperty("local.ip"));
//		context.getBean(Runnable.class).run();
//		System.out.println(context.getBean(User.class));
//		context.getBean(UserConfigs.class).show();
//		context.getBean(JdbcConfig.class).show();
		
		//yml配置文件读取
		System.out.println("yml config read");
		System.out.println(context.getEnvironment().getProperty("jdbc.username"));
		System.out.println(context.getEnvironment().getProperty("jdbc.password"));
		
		System.out.println("动态读取配置文件");
		
		System.out.println(context.getEnvironment().getProperty("springboot.name"));
		
		context.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
