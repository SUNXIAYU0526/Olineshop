package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CommodityDao;
import com.example.demo.entity.CommodityEntity;

@Service
public class CommodityServiceImpl implements CommodityService {
	
	private final CommodityDao dao;
	
	@Autowired 
	CommodityServiceImpl(CommodityDao dao){
		this.dao = dao;
	}

	@Override
	public void save(CommodityEntity commodityEntity) {
		dao.insertCommodityEntity(commodityEntity);


	}

	@Override
	public List<CommodityEntity> getAll() {
		
		return dao.getAll();
	}

}
