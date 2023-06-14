package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.CommodityEntity;

public interface CommodityDao {

	List<CommodityEntity> getAll();

	void insertCommodityEntity(CommodityEntity commodityEntity);

	

		
		
}
