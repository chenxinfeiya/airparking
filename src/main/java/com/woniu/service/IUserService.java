package com.woniu.service;

import java.util.List;

import com.woniu.model.User;

public interface IUserService {
	User findOne(String userid);
	
	User findByPhone(String userphone);
	
	void savePhoto(User user);
	
	List<User> findAll();
}
