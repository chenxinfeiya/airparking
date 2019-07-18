package com.woniu.service;

import java.util.List;

import com.woniu.model.User;

public interface IUserService {
	User findOne(Integer userid);
	List<User> findAll();
	void add(User user);
	void delete(Integer userid);
	void update(User user);
}
