package com.yunkan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yunkan.entity.Dept;

@Mapper
public interface DeptDao {
	boolean addDept(Dept dept);
	Dept findById(Long id);
	List<Dept> findAll();
}
