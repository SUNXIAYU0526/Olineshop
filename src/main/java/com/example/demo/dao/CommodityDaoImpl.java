
package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CommodityEntity;

@Repository
public class CommodityDaoImpl implements CommodityDao {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CommodityDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<CommodityEntity> getAll() {
		String sql = "SELECT comno,comcategory, comname, colour, siz, photo, price FROM commodity WHERE comno= 12345";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<CommodityEntity> list = new ArrayList<CommodityEntity>();
		for (Map<String, Object> result : resultList) {
			CommodityEntity CommodityEntity = new CommodityEntity();
			CommodityEntity.setComno((String)result. get("comno"));
			CommodityEntity.setComcategory((String)result. get("comcategory"));
			CommodityEntity.setComname((String)result. get("comname"));
			CommodityEntity.setColour((String)result. get("colour"));
			CommodityEntity.setSiz((String)result. get("siz"));
			CommodityEntity.setPhoto((String)result. get("photo"));
			CommodityEntity.setPrice((String)result. get("price"));
			

		}

		return list;
	}

	@Override
	public void insertCommodityEntity(CommodityEntity commodityEntity) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	
	}


