package com.example.demo.beanconfigfile;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    // here name of the method doesnt matter only the type

    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    // here return type is Processor but we return Snapdragon which implements Processor interface

    @Bean
    public Processor getProcessor(){
        return new Snapdragon();
    }
}
