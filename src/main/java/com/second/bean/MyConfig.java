package com.second.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    Samsung mySamsungBean(){
        return new Samsung();
    }

    @Bean
    ProcessorDragon myProcessorDragonBean(){
        return new ProcessorDragon();
    }

}
