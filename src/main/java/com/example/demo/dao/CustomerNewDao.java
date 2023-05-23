package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.CustomerNew;

public interface CustomerNewDao {
	
	void insertCustomerNew(CustomerNew customerNew);
	
	
	List<CustomerNew> getAll();

}
