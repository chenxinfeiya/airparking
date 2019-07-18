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
		try {
			parkServiceImpl.add(park);
			message = new Message(true, "车位添加成功！");
		} catch (Exception e) {
			message = new Message(true, "车位添加失败！" + e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
}
