package com.yunkan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public Dept get(@PathVariable("id") Long id){
		return deptService.get(id);
	}

	@RequestMapping("/list")
	public List<Dept> list(){
		return deptService.list();
	}
}
