package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerNewDao;
import com.example.demo.entity.CustomerNew;

@Service
public class CustomerNewServiceImpl implements CustomerNewService {
	
	private final CustomerNewDao dao;
	
	@Autowired CustomerNewServiceImpl(CustomerNewDao dao){
		this.dao = dao;
	}

	@Override
	public void save(CustomerNew customerNew) {
		dao.insertCustomerNew(customerNew);

	}

	@Override
	public List<CustomerNew> getAll() {
		
		return dao.getAll();
	}

}
