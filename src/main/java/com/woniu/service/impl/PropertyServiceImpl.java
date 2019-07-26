package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.ParkMapper;
import com.woniu.mapper.PorderMapper;
import com.woniu.mapper.PropertyMapper;
import com.woniu.mapper.UserMapper;
import com.woniu.model.Park;
import com.woniu.model.Porder;
import com.woniu.model.Property;
import com.woniu.model.User;
import com.woniu.service.IPropertyService;


@Service
@Transactional
public class PropertyServiceImpl implements IPropertyService {
	@Resource
	private UserMapper mapper;
	
	@Resource
	private PropertyMapper propertyMapper;
	
	@Resource
	private ParkMapper parkMapper;
	
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		mapper.insert(user);
	}

	@Override
	public Property findOne(String porpertyid) {
		// TODO Auto-generated method stub
		return propertyMapper.findOne(porpertyid);
	}

	@Override
	public List<Park> findAll() {
		// TODO Auto-generated method stub
		List<Park> list = parkMapper.selectByExample(null);
		List<Property> list2 = propertyMapper.findAll();
		for (Property property : list2) {
			for (Park park : list) {
//				if(property.getProparkid().equals(park.getParkid()) && park.getIsstatus()==true) {
//					String proparkid = property.getProparkid();
//				}
			}
		}

		return null;
	}

}
