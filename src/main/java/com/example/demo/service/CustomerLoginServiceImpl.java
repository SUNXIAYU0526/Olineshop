package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerLoginDao;
import com.example.demo.entity.CustomerLogin;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService {
	
	private final CustomerLoginDao dao;
	
	@Autowired CustomerLoginServiceImpl(CustomerLoginDao dao){
		this.dao = dao;
	}

	@Override
	public void save(CustomerLogin customerLogin) {
		dao.insertCustomerLogin(customerLogin);

	}

	@Override
	public List<CustomerLogin> getAll() {
		
		return dao.getAll();
	}

}
