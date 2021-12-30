package com.bean.demobean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public UserService myBean() {
        return new UserService();
    }


}
