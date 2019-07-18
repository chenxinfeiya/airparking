package com.woniu.service;

import com.woniu.model.Car;

public interface ICarService {
	
	void save(Car car);
	void delete(Integer cid);
}
