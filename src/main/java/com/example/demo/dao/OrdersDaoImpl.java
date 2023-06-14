package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.entity.OrdersEntity;

public class OrdersDaoImpl implements OrdersDao{
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public OrdersDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insert(OrdersEntity orders) {

		jdbcTemplate.update("INSERT INTO orders ( custname, custno, orderdate, orderno, comno, comname, colour, siz, quantity, price, total, photo, zip, paymentmethod, addrsess, shippingmethod ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )" ,
				"引数1","引数2","引数3");
	
		
	}

	@Override
	public List<OrdersEntity> getAll() {
		
		return null;
	}

}
