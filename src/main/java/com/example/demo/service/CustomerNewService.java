package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CustomerNew;

public interface CustomerNewService {
	
	void save(CustomerNew customerNew);
	
	List<CustomerNew> getAll();

}
