package com.woniu.web.controller;

import java.util.UUID;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.model.User;
import com.woniu.service.IRegisterService;
import com.woniu.service.impl.RegisterServiceImpl;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;

@Controller
@RequestMapping
public class RegisterController {
	@Resource 
	private IRegisterService registerServiceImpl;
	
	@RequestMapping("save")
	public String save(User user) {
		user.setUserid(CreateUUID.getUUID());
		user.setUsername(user.getUsername());
		user.setUserpass(MD5.md5s(user.getUserpass()));
		user.setUserphone(user.getUserphone());
		user.setUsersex(user.getUsersex());
		user.setUseraddress(user.getUseraddress());
		registerServiceImpl.register(user);
		return "index.jsp";
		
	}
}
