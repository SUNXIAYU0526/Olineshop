package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.CustomerEntity;

public interface CustomerDao {
	
	void insert(CustomerEntity entity);
	
	
	List<CustomerEntity> getAll();

}
