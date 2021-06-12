package com.example.demo.nobeanconfigfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// use the ComponentScan annotation and define the package which needs to be scanned

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.example.demo.nobeanconfigfile")
public class Configuration {

//    // here name of the method doesnt matter only the type
//
//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    // here return type is Processor but we return Sanpdragon which implements Processor interface
//
//    @Bean
//    public Processor getProcessor(){
//        return new Snapdragon();
//    }
}
