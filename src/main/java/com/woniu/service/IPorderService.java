package com.woniu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woniu.model.Porder;


public interface IPorderService {
	List<Porder> findAll(String userid);
}
