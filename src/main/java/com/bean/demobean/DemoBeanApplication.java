package com.bean.demobean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoBeanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoBeanApplication.class);
		UserService userService = applicationContext.getBean(UserService.class);
		System.out.println(">>> Printing all users:"+userService.createUsersAndGetList());
	}

}
