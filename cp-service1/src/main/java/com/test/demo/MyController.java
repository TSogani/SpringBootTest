package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.client.MyServiceClient;

@RestController
public class MyController {

	@Autowired
	MyServiceClient myservice;
	
	 @RequestMapping("/service1")
	    @ResponseBody
	    String home() {
		 	System.out.println("My Service home from controller : "+myservice.home());
	        return "Hello World! service 1";
	    }
	 
}
