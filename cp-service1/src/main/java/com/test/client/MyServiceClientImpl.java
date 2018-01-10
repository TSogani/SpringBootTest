package com.test.client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MyServiceClientImpl implements MyServiceClient {

	private RestTemplate restTemplate = restTemplate();
	
	//MyServiceClient myServiceClient;
	
	
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}


	@HystrixCommand(fallbackMethod = "getFallbackTransactionDetail", commandProperties = {
			@HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000") })

	@Override
	public String home() {
		
		String forObject = restTemplate.getForObject("http://localhost:8082/service2", String.class);
		System.out.println("Return String "+forObject);
		return forObject;
	}

	
	
}
