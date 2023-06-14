package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CartDao;
import com.example.demo.entity.CartEntity;

@Service
public class CartServiceImpl implements CartService {
	
	private final CartDao dao;
	
	@Autowired CartServiceImpl(CartDao dao){
		this.dao = dao;
	}

	@Override
	public void save(CartEntity cartEntity) {
		dao.insertCartEntity(cartEntity);

	}

	@Override
	public List<CartEntity> getAll() {
		
		return dao.getAll();
	}

}
