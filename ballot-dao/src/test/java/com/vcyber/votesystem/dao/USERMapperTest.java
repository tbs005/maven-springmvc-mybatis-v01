package com.vcyber.votesystem.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vcyber.votesystem.entity.USER;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring-mybatis.xml")
public class USERMapperTest {
	@Autowired
	private USERMapper userDAO;
	

	@Test
	public void testDeleteByPrimaryKey() {
		userDAO.deleteByPrimaryKey(2);
	}

	@Test
	public void testInsert() {
		USER user = new USER();
		user.setName("cccc");
		user.setMail("wangweihua@vcyber.com");
		
		int num = userDAO.insert(user);
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
