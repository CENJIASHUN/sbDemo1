package com.example.sbDemo1.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.sbDemo1")
public class SbDemo1Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(SbDemo1Application.class, args);
    }
}
