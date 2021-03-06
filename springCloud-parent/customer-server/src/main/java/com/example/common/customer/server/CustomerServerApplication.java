package com.example.common.customer.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringCloudApplication包括：@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients
public class CustomerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServerApplication.class, args);
	}


//	@Bean
//	@LoadBalanced
//	RestTemplate restTemplate()
//	{
//		return new RestTemplate();
//	}
}
