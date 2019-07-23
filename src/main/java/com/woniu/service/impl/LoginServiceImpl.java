package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.UserMapper;
import com.woniu.model.User;
import com.woniu.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{
	@Resource
	private UserMapper mapper;

	@Override
	@Transactional(readOnly = true)
	public User login(User user) {
		// TODO Auto-generated method stub
		return mapper.login(user);
	}
}
