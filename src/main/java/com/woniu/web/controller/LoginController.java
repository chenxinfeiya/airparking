package com.woniu.web.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.model.User;
import com.woniu.service.impl.LoginServiceImpl;

public class LoginController {
	@Controller
	public class UserController {
		@Resource
		private LoginServiceImpl loginservice;
		
		
		@RequestMapping("Login")
		public String Login(User user,Model model){
			
			//shiro用户认证
		    //获取subject
			Subject subject = SecurityUtils.getSubject();
			//封装用户数据
			UsernamePasswordToken userToken = new UsernamePasswordToken(user.getUsername(),user.getUserpass());
			//执行登录方法,用捕捉异常去判断是否登录成功
			try {
				subject.login(userToken);
				return "redirect:/index.jsp";
			} catch (UnknownAccountException e) {
				//用户名不存在
				model.addAttribute("msg","用户名不存在");
				return "login";
			}catch (IncorrectCredentialsException e) {
				//密码错误
				model.addAttribute("msg","密码错误");
				return "login";
			}
			
		}
}
}