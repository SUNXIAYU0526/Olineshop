package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CommodityEntity;

public interface CommodityService {
	
	void save(CommodityEntity commodityEntity);
	
	List <CommodityEntity> getAll();




}
