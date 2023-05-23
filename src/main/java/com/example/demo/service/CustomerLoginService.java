package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CustomerLogin;

public interface CustomerLoginService {
	
	void save (CustomerLogin customerLogin);
	
	List<CustomerLogin> getAll();

}
