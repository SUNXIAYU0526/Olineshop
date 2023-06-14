package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerEntity;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void insert(CustomerEntity entity) {
		jdbcTemplate.update("INSERT INTO CUSTOMER ( custno, custname, custfurigana, mailaddress, password, birthday, sex,  postno, address, telno, created) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				entity.getCustno(), entity.getCustname(), entity.getCustfurigana(), entity.getMailaddress(), entity.getPassword(), entity.getBirthday(), entity.getSex(),entity.getPostno(),entity.getAddress(), entity.getTelno(), entity.getCreated());
			}

	@Override
	public List<CustomerEntity> getAll() {
		String sql = "SELECT custno, custname, custfurigana, mailaddress, password, birthday, sex, postno, address, telno, created FROM customer";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<CustomerEntity> list = new ArrayList<CustomerEntity>();
		for (Map<String, Object> result : resultList) {
			CustomerEntity entity = new CustomerEntity();
			entity.setCustno((String) result.get("custno"));
			entity.setCustname((String)result.get("custname"));
			entity.setCustfurigana((String)result.get("custfurigana"));
			entity.setMailaddress((String)result.get("mailaddress"));
			entity.setPassword((String)result.get("password"));
			entity.setBirthday((String)result.get("birthday"));
			entity.setSex((String)result.get("sex"));
	
			entity.setPostno((String)result.get("postno"));
			entity.setAddress((String)result.get("address"));
			entity.setTelno((String)result.get("telno"));
			entity.setCreated(((Timestamp)result.get("created")).toLocalDateTime());
			list.add(entity);
		}
		return list;
		
	}
	
}

