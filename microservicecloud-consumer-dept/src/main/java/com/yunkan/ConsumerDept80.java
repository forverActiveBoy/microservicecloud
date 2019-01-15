package com.yunkan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import rule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class ConsumerDept80 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDept80.class, args);
	}

}
