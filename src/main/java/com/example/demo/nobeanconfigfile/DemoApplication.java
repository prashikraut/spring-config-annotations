package com.example.demo.nobeanconfigfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Samsung samsung = context.getBean(Samsung.class);
        samsung.getSpecs();
    }
}
