package com.example.demo.nobeanconfigfile;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements Processor{
    @Override
    public void process() {
        System.out.println("MediaTek processor");
    }
}
