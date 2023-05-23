package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerNew;

@Repository
public class CustomerNewDaoImpl implements CustomerNewDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CustomerNewDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void insertCustomerNew(CustomerNew customerNew) {
		jdbcTemplate.update("INSERT INTO CUSTOMER ( custno, custname, custfurigana, mailaddress, password, birthday, sex, postno, address, telno, created) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				customerNew.getCustno(), customerNew.getCustname(), customerNew.getCustfurigana(), customerNew.getMailaddress(), customerNew.getPassword(), customerNew.getBirthday(), customerNew.getSex(), customerNew.getPostno(),customerNew.getAddress(), customerNew.getTelno(), customerNew.getCreated());
			}

	@Override
	public List<CustomerNew> getAll() {
		String sql = "SELECT custno, custname, custfurigana, mailaddress, password, birthday, sex, postno, address, telno, created FROM customer";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<CustomerNew> list = new ArrayList<CustomerNew>();
		for (Map<String, Object> result : resultList) {
			CustomerNew customerNew = new CustomerNew();
			customerNew.setCustno((String) result.get("custno"));
			customerNew.setCustname((String)result.get("custname"));
			customerNew.setCustfurigana((String)result.get("custfurigana"));
			customerNew.setMailaddress((String)result.get("mailaddress"));
			customerNew.setPassword((String)result.get("password"));
			customerNew.setBirthday((String)result.get("birthday"));
			customerNew.setSex((String)result.get("sex"));
			customerNew.setPostno((String)result.get("postno"));
			customerNew.setAddress((String)result.get("address"));
			customerNew.setTelno((String)result.get("telno"));
			customerNew.setCreated(((Timestamp)result.get("created")).toLocalDateTime());
			list.add(customerNew);
		}
		return list;
		
	}
	
}

