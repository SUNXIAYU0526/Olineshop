package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CustomerEntity;

public interface CustomerNewService {
	
	void save(CustomerEntity customerNew);
	
	List<CustomerEntity> getAll();

}
