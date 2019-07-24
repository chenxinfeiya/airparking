package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.PorderMapper;
import com.woniu.mapper.UserMapper;
import com.woniu.model.Porder;
import com.woniu.model.Property;
import com.woniu.model.User;
import com.woniu.service.IProperty;

@Service
@Transactional
public class PropertyServiceImpl implements IProperty {
	@Resource
	private UserMapper mapper;
	
	@Resource
	private PorderMapper pormapper;
	
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		mapper.insert(user);
	}

	@Override
	public User findOne(String userid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(userid);
	}

	@Override
	public List<Porder> findAll(String propertyid) {
		// TODO Auto-generated method stub
		List<Porder> list = pormapper.selectByExample(null);
		return list;
	}


}
