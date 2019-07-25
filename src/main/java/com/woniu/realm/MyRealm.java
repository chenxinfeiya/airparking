package com.woniu.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import com.woniu.model.Role;
import com.woniu.model.User;
import com.woniu.service.IUserService;

@Component
public class MyRealm extends AuthorizingRealm{
	@Resource
	private IUserService userServiceImpl;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		
		String userphone = (String) principals.getPrimaryPrincipal();
		
		User user = userServiceImpl.findByPhone(userphone);
		
		Set<String> set = new HashSet<>();
		System.out.println(user.getRoles());
		set.add("admin");
//		if(user!=null) {
//			List<Role> roles = user.getRoles();
//			for (Role role : roles) {
//				set.add(role.getRolename());
//			}
//		}
		info.addRoles(set);
//		
//		Set<String> set2 = new HashSet<>();
		
//		if("tiger".equals(uname)) {
//			set2.add("user:create");
//			set2.add("user:find");
//		}
//		
//		for (String string : set) {
//			System.out.println(string);
//		}
//		for (String str : set2) {
//			System.out.println(str);
//		}
//		
//		info.addStringPermissions(set2);
		
		
		return info;
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
