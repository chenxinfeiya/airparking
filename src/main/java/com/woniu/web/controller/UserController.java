package com.woniu.web.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.User;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;

@RestController
@RequestMapping("/admin/user")
public class UserController {
	
//	@RequestMapping("findAll")
//	public String findAll(User user) {
//		
//		return null;
//		
//	}
}
