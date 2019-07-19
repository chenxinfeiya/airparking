package com.woniu.service;

import java.util.List;

import com.woniu.model.Car;

public interface ICarService {
	
	void save(Car car);
	void delete(Car car);
	List<Car> findAll(String userid);
}
