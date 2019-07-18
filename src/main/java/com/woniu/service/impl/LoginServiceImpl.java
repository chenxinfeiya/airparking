package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.UserMapper;
import com.woniu.model.User;
import com.woniu.model.UserExample;
import com.woniu.model.UserExample.Criteria;
import com.woniu.service.ILoginService;

@Service
@Transactional
public class LoginServiceImpl implements ILoginService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserphoneEqualTo(user.getUserphone());
		return userMapper.selectByExample(userExample).get(0);
	}
}
