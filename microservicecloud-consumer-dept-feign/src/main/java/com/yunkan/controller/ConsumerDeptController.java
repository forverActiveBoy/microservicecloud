package com.yunkan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunkan.entity.Dept;
import com.yunkan.service.DeptClientService;


@RequestMapping("/consumer")
@RestController
public class ConsumerDeptController {
	@Autowired
	private DeptClientService service;

	@RequestMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return this.service.get(id);
	}

	@RequestMapping("/dept/list")
	public List<Dept> list()
	{
		return this.service.list();
	}

	@RequestMapping("/dept/add")
	public Object add(Dept dept)
	{
		return this.service.add(dept);
	}
}
