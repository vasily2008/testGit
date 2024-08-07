package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("")
    public String hello(){
        System.out.println("hello World....2222222");

        return "OK22222222";
    }
}
