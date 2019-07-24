package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.woniu.mapper.ComplainMapper;
import com.woniu.model.Complain;
import com.woniu.service.IComplainService;

public class ComplainServiceImpl implements IComplainService {
    @Resource
    private ComplainMapper complainMapper;
	@Override
	public void addComplain(Complain complain) {
		// TODO Auto-generated method stub
		complainMapper.insert(complain);
	}

	@Override
	public void delComplain(Complain complain) {
		// TODO Auto-generated method stub
		complainMapper.updateByPrimaryKeySelective(complain);
	}

	@Override
	public void updateComplain(Complain complain) {
		// TODO Auto-generated method stub
		complainMapper.updateByPrimaryKeySelective(complain);
	}

	@Override
	public Complain findOne(String complainid) {
		// TODO Auto-generated method stub
		
		return complainMapper.selectByPrimaryKey(complainid);
	}

	@Override
	public List<Complain> findAll() {
		// TODO Auto-generated method stub
		return complainMapper.selectByExample(null);
	}

}
