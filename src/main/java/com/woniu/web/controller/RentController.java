package com.woniu.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Message;
import com.woniu.model.Rent;
import com.woniu.service.IRentService;
import com.woniu.tools.CreateUUID;


@RestController
@RequestMapping()
public class RentController {
		@Resource
		private IRentService rentServiceImpl;
		
		@RequestMapping("/addRent")
		private Message addRent(Rent rent) {
			Message message = null;
			try {
				String uuid = CreateUUID.getUUID();
				rent.setRentid(uuid);
				rentServiceImpl.addRent(rent);
				message = new Message(true, "添加发布信息成功");
			} catch (Exception e) {
				message = new Message(false, "添加发布信息失败");
				throw new RuntimeException(e);
			} finally {
				return message;
			}
		}
		
		@RequestMapping("/delRent")
		private Message delRent(Rent rent) {
			Message message = null;
			try {
				rentServiceImpl.delRent(rent);
				message = new Message(true, "添加发布信息成功");
			} catch (Exception e) {
				message = new Message(false,"删除发布信息失败");
				throw new RuntimeException(e);
			} finally {
				return message;
			}
		}
		
		@RequestMapping("/updateRent")
		private Message updateRent(Rent rent) {
			Message message = null;
			try {
				rentServiceImpl.updateRent(rent);
				message = new Message(true, "发布信息更新成功");
			} catch (Exception e) {
				message = new Message(false, "发布信息更新失败");
				throw new RuntimeException(e);
			} finally {
				return message;
			}
		}
		
		@RequestMapping("/findOne")
		private Message findOne(String rentid) {
			Message message = null;
			try {
				rentServiceImpl.findOne(rentid);
				message = new Message(true, "查询成功");
			} catch (Exception e) {
				message = new Message(false, "查询失败");
				throw new RuntimeException(e);
			} finally {
				return message;
			}
		}
}
