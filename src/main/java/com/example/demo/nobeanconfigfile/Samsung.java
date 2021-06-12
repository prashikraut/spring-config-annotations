package com.example.demo.nobeanconfigfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// default name of bean is class name with first letter small
// to set custom name use @Component("mySamsung")

@Component
public class Samsung {

    // processor has 2 implementations snapdragon and mediatek
    // to choose between the 2 we use @Qualifier("beanName")

    @Autowired
    @Qualifier("mediaTek")
    Processor processor;

    public void getSpecs(){
        System.out.println("Samsung specs");
        processor.process();
    }
}
