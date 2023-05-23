package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerLogin;

@Repository
public class CustomerLoginDaoImpl implements CustomerLoginDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CustomerLoginDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertCustomerLogin(CustomerLogin customerLogin) {
		jdbcTemplate.update("INSERT INTO LOGIN (mailaddress, password, created) VALUES(?, ?, ?, ?)" ,
				customerLogin.getMailaddress(), customerLogin.getPassword(), customerLogin.getCreated());
	}
	

	@Override
	public List<CustomerLogin> getAll() {
		String sql = "SELECT mailaddress, password, created";
		List<Map<String,Object>> resultList = jdbcTemplate.queryForList(sql);
		List<CustomerLogin> list = new ArrayList<CustomerLogin>();
		for(Map<String, Object> result : resultList) {
			CustomerLogin customerLogin = new CustomerLogin();
			customerLogin.setMailaddress((String) result.get("mailaddress"));
			customerLogin.setPassword((String)result.get("password"));
			customerLogin.setCreated(((Timestamp)result.get("created")).toLocalDateTime());
		}
		
		return list;
	}

}
