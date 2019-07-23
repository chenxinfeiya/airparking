package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.TreeMapper;
import com.woniu.service.ITreeService;

@Service
public class TreeServiceImpl implements ITreeService {
	@Resource
	private TreeMapper treeMapper;

	
	@Transactional(readOnly=true)
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return treeMapper.selectByExample(null);
	}

}
