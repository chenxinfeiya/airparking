package com.woniu.service;

import java.util.List;

import com.woniu.model.Park;
import com.woniu.model.Property;
import com.woniu.model.User;


public interface IPropertyService {
	void update(User user);
	Property findOne(String propertyid);
	List<Park> findAll();
}
