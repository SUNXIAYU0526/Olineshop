package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CartEntity;

@Repository
public class CartDaoImpl implements CartDao {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public CartDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	} 

	@Override
	public void insertCartEntity(CartEntity cartEntity) {
		jdbcTemplate.update("INSERT INTO CART (comno,comcategory,comname,colour,siz,photo,quantity, price,created) VALUES(?,?,?,?,?,?,?,?,?)" ,
				cartEntity.getComno(), cartEntity.getComcategory(), cartEntity.getComname(), 
				cartEntity.getColour(), cartEntity.getSiz(), cartEntity.getPhoto(),
				cartEntity.getQuantity(), cartEntity.getPrice(), cartEntity.getCreated());

}

	
	
	
	
	@Override
	public List<CartEntity> getAll() {
		String sql = "SELECT comno,comcategory,comname,colour,siz,photo,quantity,price,created FROM cart";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<CartEntity> list = new ArrayList<CartEntity>();
		for(Map<String, Object> result : resultList) {
			CartEntity cartEntity = new CartEntity();
			cartEntity.setComno((String)result. get("comno"));
			cartEntity.setComcategory((String)result. get("comcategory"));
			cartEntity.setComname((String)result. get("comname"));
			cartEntity.setColour((String)result. get("colour"));
			cartEntity.setSiz((String)result. get("siz"));
			cartEntity.setPhoto((String)result. get("photo"));
			cartEntity.setQuantity((String)result. get("quantity"));
			cartEntity.setPrice((String)result. get("price"));
//			
//			
//			BigDecimal Quantity =(BigDecimal)result. get("quantity");
//			cartEntity.setQuantity(String.valueOf(Quantity.intValue()));
//			
//			BigDecimal Price =(BigDecimal)result. get("price");
//			cartEntity.setPrice(String.valueOf(Price.intValue()));
			
			cartEntity.setCreated(((Timestamp)result. get("created")).toLocalDateTime());
			list.add(cartEntity);

			
		}
				
				
		return list;
	}

}
