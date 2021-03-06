package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.RentMapper;
import com.woniu.model.Rent;
import com.woniu.service.IRentService;

@Service
public class RentServiceImpl implements IRentService {
	
	@Resource
	private RentMapper rentMapper;
	
	@Override
	@Transactional
	public void addRent(Rent rent) {
			rentMapper.insert(rent);
	}

	@Override
	public void delRent(Rent rent) {
		rent.setIsputaway(true);
		rentMapper.updateByPrimaryKeySelective(rent);
	}

	@Override
	public void updateRent(Rent rent) {
		rentMapper.updateByPrimaryKeySelective(rent);
	}

	@Override
	public Rent findOne(String rentid) {
		Rent rent = rentMapper.selectByPrimaryKey(rentid);
		return rent;
	}

}
