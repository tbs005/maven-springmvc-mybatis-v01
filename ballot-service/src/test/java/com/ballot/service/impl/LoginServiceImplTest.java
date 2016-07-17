package com.ballot.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ballot.entity.USER;
import com.ballot.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-mybatis.xml","classpath*:spring-aop.xml"})
public class LoginServiceImplTest {
	
	@Autowired
	LoginService loginService;
	
	@Test
	public void testCreateUser() {
		
		USER user = new USER();
		user.setName("CreateUserTest");
		user.setMail("wangweihua@vcyber.com");
		
		assertTrue(loginService.createUser(user));
	}

}
