package com.csyaonie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.csyaonie.mapping")
public class SpringBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatisApplication.class, args);
	}

}

