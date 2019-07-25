package com.woniu.service;

import java.util.List;

import com.woniu.model.Park;
import com.woniu.model.Porder;
import com.woniu.model.User;


public interface IPropertyService {
	void update(User user);
	User findOne(String userid);
	List<Park> findAll();
}
