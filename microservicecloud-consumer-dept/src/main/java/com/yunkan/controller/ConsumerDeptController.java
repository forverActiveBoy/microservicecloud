package com.yunkan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yunkan.entity.Dept;

@RestController
@RequestMapping("/consumer/dept")
public class ConsumerDeptController {
	@Autowired
	private RestTemplate restTemplate;
	/*private static final String REST_URL_PREFIX = "http://localhost:8001"; */
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT"; 
	@RequestMapping("/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}

	@RequestMapping("/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/{id}", Dept.class, id);
	}

	@RequestMapping("/list")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
}
