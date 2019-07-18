package com.woniu.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Message;
import com.woniu.model.Park;
import com.woniu.service.IParkService;

@RestController
@RequestMapping()
public class ParkController {
	@Resource
	private IParkService parkServiceImpl;
	
	@RequestMapping()
	private Message addPark(Park park) {
		Message message = null;
		
		return null;
	}
	
}
