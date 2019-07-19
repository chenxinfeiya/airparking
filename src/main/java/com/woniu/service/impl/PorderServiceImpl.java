package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.PorderMapper;
import com.woniu.model.Porder;
import com.woniu.service.IPorderService;

@Service
public class PorderServiceImpl implements IPorderService{
	
	@Resource
	private PorderMapper porderMapper;
	
	@Override
	@Transactional
	public List<Porder> findAll(String userid) {
		
		return porderMapper.selectByUserid(userid);
	}
	@Override
	@Transactional
	public void save(Porder porder) {
		
		porderMapper.insertSelective(porder);
		
	}

}
