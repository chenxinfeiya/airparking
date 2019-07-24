package com.woniu.service;

import java.util.List;

import com.woniu.model.Park;
import com.woniu.model.User;

public interface IParkService {
	Park findOne(String parkid);
	List<Park> findAll(User user);
	void add(Park park);
	void delete(Park park);
	void update(Park park);
}
