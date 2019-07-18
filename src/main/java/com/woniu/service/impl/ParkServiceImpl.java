package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.ParkMapper;
import com.woniu.model.Park;
import com.woniu.service.IParkService;
import com.woniu.tools.CreateUUID;

@Service
public class ParkServiceImpl implements IParkService {
	@Resource
	private ParkMapper parkMapper;
	@Override
	public Park findOne(String parkid) {
		Park park = parkMapper.selectByPrimaryKey(parkid);
		return park;
	}

	@Override
	public List<Park> findAll() {
		List<Park> parks = parkMapper.selectByExample(null);
		return parks;
	}

	@Override
	public void add(Park park) {
		String uuid = CreateUUID.getUUID();
//		park.setParkid(uuid);
		
		parkMapper.insert(park);
	}

	@Override
	public void delete(Integer parkid) {
		
	}

	@Override
	public void update(Park park) {
		
	}

}
