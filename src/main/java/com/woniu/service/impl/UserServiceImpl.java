package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.UserMapper;
import com.woniu.model.User;
import com.woniu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User findOne(String userid) {
		User user = userMapper.selectByPrimaryKey(userid);
		return user;
	}

	@Override
	public void savePhoto(User user) {
		userMapper.insertSelective(user);
	}

	@Override
	public List<User> findAll() {
		return userMapper.selectByExample(null);
	}
	
	
}
