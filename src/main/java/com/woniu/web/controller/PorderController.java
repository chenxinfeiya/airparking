package com.woniu.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Message;
import com.woniu.model.Porder;
import com.woniu.service.IPorderService;
import com.woniu.tools.CreateUUID;

@RestController
@RequestMapping("/admin/porder")
public class PorderController {
	
	@Resource
	private IPorderService porderServiceImpl;
	
	@RequestMapping("findAll")
	private List<Porder> findAll(String userid){
		List<Porder> list = porderServiceImpl.findAll(userid);
		return list;
	}
	
	
	@RequestMapping("save")
	private Message save(Porder porder){
		Message message = null;
		porder.setOcreatetime(new Date());
		porder.setOrderid(CreateUUID.getUUID());
		try {
			porderServiceImpl.save(porder);
			message = new Message(true, "订单完成");
		} catch (Exception e) {
			message = new Message(false, "订单失败,请联系程序员小哥哥"+e);
		}
		return message;
	}
	
	
}
