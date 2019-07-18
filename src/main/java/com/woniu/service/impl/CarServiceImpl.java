package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.CarMapper;
import com.woniu.model.Car;
import com.woniu.service.ICarService;

@Service
public class CarServiceImpl implements ICarService{
	
	@Resource
	private CarMapper carMapper;
	
	@Override
	public void save(Car car) {
		carMapper.insertSelective(car);
		
	}
	@Override
	public void delete(Car car) {
		carMapper.updateByPrimaryKeySelective(car);
		
	}

	@Override
	public void findAll() {
		carMapper.selectByExample(null);
		
	}

}
