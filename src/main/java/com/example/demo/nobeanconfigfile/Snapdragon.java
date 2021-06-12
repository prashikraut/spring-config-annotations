package com.example.demo.nobeanconfigfile;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {
    @Override
    public void process() {
        System.out.println("Snapdragon processor");
    }
}
