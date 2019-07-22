package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.CarMapper;
import com.woniu.model.Car;
import com.woniu.service.ICarService;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;

@Service
public class CarServiceImpl implements ICarService{
	
	@Resource
	private CarMapper carMapper;
	
	@Override
	@Transactional
	public void save(Car car) {
		car.setCarid(CreateUUID.getUUID());
		carMapper.insertSelective(car);
	}
	
	@Override
	@Transactional
	public void delete(Car car) {
		carMapper.updateByPrimaryKeySelective(car);
		
	}

	@Override
	@Transactional
	public List<Car> findAll(String userid) {
//		List<Car> list = carMapper.selectByUserid(userid);
		return null;
	}

}
