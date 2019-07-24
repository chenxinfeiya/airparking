package com.woniu.web.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.model.Porder;
import com.woniu.model.User;
import com.woniu.service.IProperty;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;

@Controller
@RequestMapping
public class PropertyController {
	
	private IProperty property;
	
	@RequestMapping("update")
	public String update(User user) {
		user.setUsername("username");
		user.setUserpass("userpass");
		user.setUseraddress("useraddress");
		user.setUserphoto("userphoto");
		user.setUsersex(true);
		user.setBirthday(null);
		property.update(user);
		return "update.jsp";
	}
	
	@RequestMapping("findUser")
	public String findUser(String userid) {
		return "property.findOne(userid)";
	}
	@RequestMapping("findAll")
	public List<Porder> findAll(){
		List<Porder> list = property.findAll("propertyid");
		return list;
	}
}