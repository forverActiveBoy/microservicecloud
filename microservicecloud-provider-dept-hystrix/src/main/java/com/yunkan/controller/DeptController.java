package com.yunkan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yunkan.entity.Dept;
import com.yunkan.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/add")
	public boolean add(@RequestBody Dept dept){
		return deptService.add(dept);
	}

	@RequestMapping("/get/{id}")
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id){
		Dept dept = deptService.get(id);
		if (null == dept) {
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
		}
		return dept;
	}
	public Dept processHystrix_Get(@PathVariable("id") Long id){
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}
	

	@RequestMapping("/list")
	public List<Dept> list(){
		return deptService.list();
	}
}
