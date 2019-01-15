package com.yunkan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ProviderDept8002 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderDept8002.class, args);
	}
}
