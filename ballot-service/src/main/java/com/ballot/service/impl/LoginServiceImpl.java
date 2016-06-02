package com.ballot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ballot.dao.USERMapper;
import com.ballot.entity.USER;
import com.ballot.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private USERMapper userDAO;

	@Override
	public boolean createUser(USER user) {
		int num = userDAO.insert(user);
		if (num <= 0) {
			return false;
		}
		return true;
	}

	@Override
	public USER findUser(USER user) {
		return userDAO.findUser(user);
	}

	@Override
	public List<USER> findALLUser() {
		return userDAO.findAllUser();
	}

	@Override
	public USER findUserById(Integer id) {
		return userDAO.selectByPrimaryKey(id);
		
	}

	@Override
	public void updateUser(USER user) {
		userDAO.updateByPrimaryKey(user);
	}

}
