package com.woniu.service.impl;

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
	public User findAll(String userid) {
		userMapper.selectByPrimaryKey(userid);
		return null;
	}
	
	
}
