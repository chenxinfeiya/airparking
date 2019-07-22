package com.woniu.service;

import com.woniu.model.User;

public interface IUserService {
	User findAll(String userid);
	
	void savePhoto(User user);
}
