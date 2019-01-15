package com.yunkan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderDept8001Hystrix {
	public static void main(String[] args) {
		SpringApplication.run(ProviderDept8001Hystrix.class, args);
	}
}
