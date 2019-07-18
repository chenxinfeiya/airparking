package com.woniu.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Message;
import com.woniu.service.ICarService;

@RestController
public class CarController {

	@Resource
	private ICarService carServiceImpl;
	
//	private Message save() {
//		
//	}
}
