package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.User;
import com.woniu.service.ITreeService;
import com.woniu.service.impl.LoginServiceImpl;
import com.woniu.service.impl.TreeServiceImpl;
import com.woniu.tools.CreateUUID;
import com.woniu.tools.MD5;


@Controller
public class LoginController {
		@Resource
		private LoginServiceImpl loginservice;
		
		
		@RequestMapping("login")
		public String login(User user,ModelMap map,HttpSession session) throws Exception {
			if(user.getUserpass()!=null)
				user.setUserpass(MD5.md5s(user.getUserpass()));
				user = loginservice.login(user);
				if(user==null) {
					map.put("error", "账号或密码错误，请重新输入");
					return "index.html";
				}else {
					ObjectMapper objectMapper = new ObjectMapper();
					String json = objectMapper.writeValueAsString(user.getTrees());
					session.setAttribute("json", json);
					session.setAttribute("user", user);
					return "redirect:/admin/index.jsp";
				}
			}
		}