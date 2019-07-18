package com.woniu.service.impl;

import javax.annotation.Resource;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.UserMapper;
import com.woniu.model.User;
import com.woniu.service.IRegisterService;

@Service
@Transactional
public class RegisterServiceImpl implements IRegisterService {
	@Resource
	private UserMapper mapper;
	
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		mapper.insert(user);
	}
	
}
