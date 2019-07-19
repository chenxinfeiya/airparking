package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Message;
import com.woniu.model.Park;
import com.woniu.service.IParkService;
import com.woniu.tools.CreateUUID;

@RestController
@RequestMapping("/admin/park")
public class ParkController {
	@Resource
	private IParkService parkServiceImpl;
	
	@RequestMapping("addPark")
	private Message addPark(Park park) {
		Message message = null;
		try {
			String uuid = CreateUUID.getUUID();
			park.setParkid(uuid);
			parkServiceImpl.add(park);
			message = new Message(true, "车位添加成功！");
		} catch (Exception e) {
			message = new Message(true, "车位添加失败！" + e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
	@RequestMapping("delPark")
	private Message delPark(Park park) {
		Message message = null;
		try {
			parkServiceImpl.delete(park);
			message = new Message(true, "车位删除成功！");
		} catch (Exception e) {
			message = new Message(true, "车位删除失败！" + e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
	@RequestMapping("updatePark")
	private Message updatePark(Park park) {
		Message message = null;
		try {
			parkServiceImpl.update(park);
			message = new Message(true, "车位修改成功！");
		} catch (Exception e) {
			message = new Message(true, "车位修改失败！" + e);
			throw new RuntimeException(e);
		} finally {
			return message;
		}
	}
	
	@RequestMapping("findOne")
	private Park findOne(String parkid) {
		Park findOne = parkServiceImpl.findOne(parkid);
		return findOne;
	}
	
	@RequestMapping("findALL")
	private List findALL() {
		List<Park> parks = parkServiceImpl.findAll();
		return parks;
	}
	
	
	
	
}
