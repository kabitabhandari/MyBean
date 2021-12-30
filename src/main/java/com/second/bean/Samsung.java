package com.second.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    ProcessorDragon processorDragon;

    public void samsung2020(){
        System.out.println("This is Samsung 2020 phone");
        processorDragon.process();
    }
}
