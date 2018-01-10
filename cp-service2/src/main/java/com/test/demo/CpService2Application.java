package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableFeignClients
@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class CpService2Application {

	public static void main(String[] args) {
		SpringApplication.run(CpService2Application.class, args);
	}
	
	 @RequestMapping("/service2")
	    @ResponseBody
	    String home() {
	        return "Hello World! service 2 ";
	    }
}
