package com.sowing.seed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sowing.seed.dao.IGrainDao;
import com.sowing.seed.model.Grain;
import com.sowing.seed.service.IGrainService;

@Service 
public class GrainServiceImpl implements IGrainService {

	@Autowired
	IGrainDao grainDao;
	
	@Override
	public void createGrain(Grain grain) {
		grainDao.save(grain);
		
	}

	@Override
	public List<Grain> getAllGrains() {
		return grainDao.findAll();
	}
}
