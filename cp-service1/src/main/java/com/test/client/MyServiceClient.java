package com.test.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "my-service", url="http://localhost:8082")
public interface MyServiceClient {
	
	//@RequestMapping(value="/service2" , method=RequestMethod.GET)
	 String home();
	
}
