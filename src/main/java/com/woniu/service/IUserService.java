package com.woniu.service;

import java.util.List;

import com.woniu.model.Park;

public interface IUserService {
	Park findOne(Integer parkid);
	List<Park> findAll();
	void add(Park park);
	void delete(Integer parkid);
	void update(Park park);
}
