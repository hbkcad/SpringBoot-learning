package com.sowing.seed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sowing.seed.dao.ISoilDao;
import com.sowing.seed.model.Soil;
import com.sowing.seed.service.ISoilService;

@Service
public class SoilServiceImpl implements ISoilService {

	@Autowired
	ISoilDao iSoilDao;
	
	@Override
	public void createSoil(Soil soil) {
		iSoilDao.save(soil);
		
	}

	@Override
	public List<Soil> getAllSoil() {
		
		return iSoilDao.findAll();
	}

	
}
