package com.woniu;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniu.mapper.RoleMapper;
import com.woniu.mapper.UserMapper;
import com.woniu.model.Role;
import com.woniu.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirparkingApplicationTests {

	@Resource
	private UserMapper userMapper;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testName() throws Exception {
		User user = userMapper.selectByPrimaryKey("1");
		System.out.println(user);
	}
}
