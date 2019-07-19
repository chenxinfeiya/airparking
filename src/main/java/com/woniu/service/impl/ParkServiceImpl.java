package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.ParkMapper;
import com.woniu.model.Park;
import com.woniu.model.ParkExample;
import com.woniu.service.IParkService;
import com.woniu.tools.CreateUUID;

@Service
public class ParkServiceImpl implements IParkService {
	@Resource
	private ParkMapper parkMapper;
	@Override
	@Transactional
	public Park findOne(String parkid) {
		Park park = parkMapper.selectByPrimaryKey(parkid);
		return park;
	}

	@Override
	@Transactional
	public List<Park> findAll() {
		List<Park> parks = parkMapper.selectByExample(null);
		return parks;
	}

	@Override
	@Transactional
	public void add(Park park) {
		parkMapper.insert(park);
	}

	@Override
	@Transactional
	public void delete(Park park) {
		park.setIsdelete(true);
		parkMapper.updateByPrimaryKeySelective(park);
		
	}

	@Override
	@Transactional
	public void update(Park park) {
		parkMapper.updateByPrimaryKeySelective(park);
	}
}
