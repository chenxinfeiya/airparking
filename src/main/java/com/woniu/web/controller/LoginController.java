package com.woniu.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.User;
import com.woniu.service.ILoginService;


@RestController
public class LoginController {
		@Resource
		private ILoginService loginserviceImpl;
		
		@RequestMapping("/login")
		public String  login(String userphone,String userpass,String code,HttpServletRequest req){
			System.out.println(userphone+"++++++++++++++++++++"+userpass+"================="+code);
			Subject subject = SecurityUtils.getSubject();
			System.out.println(subject.isAuthenticated());
			if(!subject.isAuthenticated()) {
				UsernamePasswordToken ut = new UsernamePasswordToken(userphone,userpass);
				try{
					subject.login(ut);
					boolean flag = subject.isAuthenticated();
					
					if(flag) {
						req.getSession().setAttribute("loginUser", subject.getSession().getAttribute("user"));
					}
					System.out.println("认证成功");
					return "true";
				} catch(IncorrectCredentialsException e){
					System.out.println("密码异常"); 
				}
			}
			return "false";
		}
}