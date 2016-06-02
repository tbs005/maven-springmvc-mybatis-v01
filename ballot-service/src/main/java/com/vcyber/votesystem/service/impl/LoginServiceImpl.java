package com.vcyber.votesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcyber.votesystem.dao.USERMapper;
import com.vcyber.votesystem.entity.USER;
import com.vcyber.votesystem.service.LoginService;

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
