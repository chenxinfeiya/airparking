package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.CarMapper;
import com.woniu.model.Car;
import com.woniu.service.ICarService;

@Service
public class CarServiceImpl implements ICarService{
	
	@Resource
	private CarMapper carMapper;
	
	@Override
	@Transactional
	public void save(Car car) {
		carMapper.insertSelective(car);
		
	}
	@Override
	@Transactional
	public void delete(Car car) {
		carMapper.updateByPrimaryKeySelective(car);
		
	}

	@Override
	@Transactional
	public List<Car> findAll() {
		List<Car> list = carMapper.selectByExample(null);
		return list;
	}

}
