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
import com.woniu.model.Property;
import com.woniu.model.User;
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
	public void settle(Porder porder,User user1) {
		//租车方余额结算
		user1.setUbalance(user1.getUbalance()-porder.getTotalprice());
		userMapper.updateByPrimaryKeySelective(user1);
		
		//出租车位方收益
		Park park = parkMapper.selectByPrimaryKey(porder.getCarid());
		User user = userMapper.findUearningsByUserid(park.getUserid());
		user.setUearnings(user.getUearnings()+porder.getTotalprice()*0.5);
		userMapper.updateByPrimaryKeySelective(user);
		
		//物业方收益
		Property pp = propertyMapper.findPearningsByPropertyid(park.getPropertyid());
		pp.setPearnings(pp.getPearnings()+porder.getTotalprice()*0.5*pp.getProportion()*0.01);
		propertyMapper.updateByPrimaryKeySelective(pp);
		
		//平台方收益
		User admin = userMapper.findUearningsByUserid("admin");
		admin.setUearnings(admin.getUearnings()+porder.getTotalprice()*0.5*(100-pp.getProportion())*0.01);
		userMapper.updateByPrimaryKeySelective(admin);
	}

}
