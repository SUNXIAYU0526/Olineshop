package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.CustomerEntity;

@Service
public class CustomerNewServiceImpl implements CustomerNewService {
	
	private final CustomerDao dao;
	
	@Autowired CustomerNewServiceImpl(CustomerDao dao){
		this.dao = dao;
	}

	@Override
	public void save(CustomerEntity customerNew) {
		dao.insert(customerNew);

	}

	@Override
	public List<CustomerEntity> getAll() {
		
		return dao.getAll();
	}

}
