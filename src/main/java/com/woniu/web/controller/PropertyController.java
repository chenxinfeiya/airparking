package com.woniu.web.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.Porder;
import com.woniu.model.Property;
import com.woniu.model.User;
import com.woniu.service.IPropertyService;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;

@Controller
@RequestMapping
public class PropertyController {
	
	private IPropertyService propertyImpl;
	
	@RequestMapping("update")
	public String update(User user) {
		user.setUsername("username");
		user.setUserpass("userpass");
		user.setUseraddress("useraddress");
		user.setUserphoto("userphoto");
		user.setUsersex(true);
		user.setBirthday(null);
		propertyImpl.update(user);
		return "update.jsp";
	}
	
	@RequestMapping("findUser")
	public String findUser(String propertyid) {
		Property property = propertyImpl.findOne(propertyid);
		String propertyname = property.getPropertyname();
		String propertyphone = property.getPropertyphone();
		String fulladdress = property.getFulladdress();
		return "index.html";
	}
	@RequestMapping("findAll")
	public List<Porder> findAll(){
		//List<Porder> list = property.findAll("propertyid");
		return null;
	}
}