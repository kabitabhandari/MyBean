package com.second.bean;

import com.bean.demobean.DemoBeanApplication;
import com.bean.demobean.UserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainApplication.class);
		Samsung samsung1 = applicationContext.getBean(Samsung.class);
		samsung1.samsung2020();
	}

}
