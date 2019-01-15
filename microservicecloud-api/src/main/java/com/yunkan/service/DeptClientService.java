package com.yunkan.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yunkan.entity.Dept;



//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService{
	@RequestMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") long id);

	@RequestMapping("/dept/list")
	public List<Dept> list();

	@RequestMapping("/dept/add")
	public boolean add(Dept dept);
}
