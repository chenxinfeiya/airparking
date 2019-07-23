package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.ParkMapper;
import com.woniu.mapper.PorderMapper;
import com.woniu.mapper.PropertyMapper;
import com.woniu.mapper.UserMapper;
import com.woniu.model.Park;
import com.woniu.model.Porder;
import com.woniu.model.PorderExample;
import com.woniu.model.PorderExample.Criteria;
import com.woniu.service.IPorderService;

@Service
public class PorderServiceImpl implements IPorderService{
	
	@Resource
	private PorderMapper porderMapper;
	
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private PropertyMapper propertyMapper;
	
	@Resource
	private ParkMapper parkMapper;
	
	@Override
	@Transactional
	public List<Porder> findAll(Porder porder) {
		PorderExample pe = new PorderExample();
		Criteria criteria = pe.createCriteria();
		criteria.andUseridEqualTo(porder.getUserid());
		criteria.andIsfinishEqualTo(porder.getIsfinish());
		List<Porder> list = porderMapper.selectByExample(pe);
		return list;
	}
	
	
	@Override
	@Transactional
	public void save(Porder porder) {
		porderMapper.insertSelective(porder);
	}
	
	
	@Override
	@Transactional
	public void settle(Porder porder) {
		//出租车位方收益
		Park park = parkMapper.selectByPrimaryKey(porder.getCarid());
		
		
	}

}
