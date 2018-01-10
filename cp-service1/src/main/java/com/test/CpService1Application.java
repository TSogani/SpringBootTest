package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableAutoConfiguration
public class CpService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CpService1Application.class, args);
	}
	
	
}
