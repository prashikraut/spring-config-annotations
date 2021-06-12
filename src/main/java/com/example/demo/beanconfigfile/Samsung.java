package com.example.demo.beanconfigfile;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    Processor processor;

    public void getSpecs(){
        System.out.println("Samsung specs");
        processor.process();
    }
}
