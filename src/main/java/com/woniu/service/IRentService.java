package com.woniu.service;

import com.woniu.model.Rent;

public interface IRentService {
	void addRent(Rent rent);
	void delRent(Rent rent);
	void updateRent(Rent rent);
	
	Rent findOne(String uid);
}
