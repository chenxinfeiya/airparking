package com.woniu.service;

import java.util.List;

import com.woniu.model.Porder;
import com.woniu.model.Property;
import com.woniu.model.User;


public interface IProperty {
	void update(User user);
	User findOne(String userid);
	List<Porder> findAll(String propertyid);
}
