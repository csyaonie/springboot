package com.csyaonie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbatisApplication {

	@RequestMapping("hello")
	public String hello(){
		return "springboot hell world";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbatisApplication.class, args);
	}

}

