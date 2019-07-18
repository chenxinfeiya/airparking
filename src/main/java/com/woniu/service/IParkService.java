package com.woniu.service;

import java.util.List;

import com.woniu.model.Park;

public interface IParkService {
	Park findOne(String parkid);
	List<Park> findAll();
	void add(Park park);
	void delete(Park park);
	void update(Park park);
}
