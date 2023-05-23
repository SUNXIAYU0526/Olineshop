package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.CustomerLogin;

public interface CustomerLoginDao {
	
void insertCustomerLogin(CustomerLogin customerLogin);
	
	
	List<CustomerLogin> getAll();

}
