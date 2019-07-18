package com.woniu.realm;

import javax.annotation.Resource;
import javax.imageio.spi.RegisterableService;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import com.woniu.model.User;
import com.woniu.service.impl.LoginServiceImpl;
import com.woniu.service.impl.RegisterServiceImpl;

public class MyRealm extends AuthorizingRealm {
	@Resource
	private LoginServiceImpl login;
	//执行授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		System.out.println("授权");
		//获取当前登录用户
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipals();
		//给资源授权
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.addStringPermission(user.getUsername());
		return simpleAuthorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken tkuser = (UsernamePasswordToken) token;
		User realUser = new User();
		realUser.setUsername(tkuser.getUsername());
		realUser.setUserpass(String.copyValueOf(tkuser.getPassword()));
		User newUser = login.login(realUser);
		//System.out.println(user.getUsername());
		if(newUser == null){
			//用户名错误
			//shiro会抛出UnknownAccountException异常
			return null;
		}
		
		return new SimpleAuthenticationInfo(newUser,newUser.getUserpass(),"");
	}	
}