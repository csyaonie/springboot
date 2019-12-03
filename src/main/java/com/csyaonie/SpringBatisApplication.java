package com.csyaonie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.csyaonie.mapping")
@EnableScheduling
public class SpringBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatisApplication.class, args);
	}

}

