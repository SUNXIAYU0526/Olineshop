package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CartEntity;

public interface CartService {

	void save (CartEntity cartEntity);
	
	List <CartEntity> getAll();
}
