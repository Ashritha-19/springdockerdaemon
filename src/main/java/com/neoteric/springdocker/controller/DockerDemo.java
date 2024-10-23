package com.neoteric.springdocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemo {

        @GetMapping(value = "/docker")
    public String hello(){

        System.out.println("ashri");

        return "krish";

    }
}
