package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.OrdersEntity;

public interface OrdersDao {
	
	void insert(OrdersEntity  orders);
	
	List<OrdersEntity> getAll();

}
