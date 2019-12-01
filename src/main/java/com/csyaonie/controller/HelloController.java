package com.csyaonie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("hehe")
    public String exceptionTest(){

        int a=2/0;


        return "fff";
    }
}
