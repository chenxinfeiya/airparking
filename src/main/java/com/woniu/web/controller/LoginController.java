package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.User;
import com.woniu.service.ILoginService;


@Controller
public class LoginController {
		@Resource
		private ILoginService loginserviceImpl;
		
		
		@RequestMapping("login")
		public String login(User user,ModelMap map,HttpSession session) throws Exception {
			System.out.println("LoginController.login()");
			if(user.getUserpass()!=null)
				//user.setUserpass(MD5.md5s(user.getUserpass()));
				user = loginserviceImpl.login(user);
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