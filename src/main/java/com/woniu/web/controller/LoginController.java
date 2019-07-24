package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.User;
import com.woniu.service.ILoginService;


@RestController
public class LoginController {
		@Resource
		private ILoginService loginserviceImpl;
		
		@RequestMapping("/login")
		public String  login(String userphone,String userpass){
			System.out.println("LoginController.login()");
			System.out.println(userphone);
			System.out.println(userpass);
			return null;
		}
}