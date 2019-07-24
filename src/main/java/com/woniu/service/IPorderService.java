package com.woniu.service;

import java.util.List;

import com.woniu.model.Porder;
import com.woniu.model.User;


public interface IPorderService {
	List<Porder> findAll(Porder porder);
	
	void save(Porder porder);
	
	void settle(Porder porder,User user);
}
