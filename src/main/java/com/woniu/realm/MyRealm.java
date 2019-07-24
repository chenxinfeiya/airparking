package com.woniu.realm;

import javax.annotation.Resource;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.woniu.model.User;
import com.woniu.service.IUserService;

@Component
public class MyRealm extends AuthorizingRealm{
	@Resource
	private IUserService userServiceImpl;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userphone = token.getPrincipal().toString();
		
		User user = userServiceImpl.findByPhone(userphone);
		
		String userPhone = "";
		String userPass = "";
		if(user!=null) {
			userPhone = user.getUserphone();
			userPass = user.getUserpass();
		}
		AuthenticationInfo info2 = new SimpleAuthenticationInfo(userPhone,userPass,getName());
		return info2;
	}

}	
