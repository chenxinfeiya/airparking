package com.woniu.service;

import java.util.List;

import com.woniu.model.Porder;


public interface IPorderService {
	List<Porder> findAll(String userid);
	
	void save(Porder porder);
}
