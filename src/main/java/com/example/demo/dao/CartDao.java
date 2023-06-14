package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.CartEntity;

public interface CartDao {

	
	void insertCartEntity (CartEntity cartentity );
	
	List <CartEntity> getAll();
}
