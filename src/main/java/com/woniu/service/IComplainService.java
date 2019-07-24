package com.woniu.service;

import java.util.List;

import com.woniu.model.Complain;

public interface IComplainService {
		void addComplain(Complain complain);
		void delComplain(Complain complain);
		void updateComplain(Complain complain);
		Complain findOne(String complainid);
		List<Complain> findAll();
}