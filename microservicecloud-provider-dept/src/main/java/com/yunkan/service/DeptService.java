package com.yunkan.service;

import java.util.List;

import com.yunkan.entity.Dept;

public interface DeptService {
	boolean add(Dept dept);
	Dept get(Long id);
	List<Dept> list();
}
