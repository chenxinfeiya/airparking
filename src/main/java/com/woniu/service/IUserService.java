package com.woniu.service;

import java.util.List;

import com.woniu.model.User;

public interface IUserService {
	User findOne(String userid);
	
	void savePhoto(User user);
	
	List<User> findAll();
}
