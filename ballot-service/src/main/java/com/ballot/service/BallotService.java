package com.ballot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ballot.dao.USERMapper;
import com.ballot.dao.VOTEMapper;
import com.ballot.entity.USER;
import com.ballot.entity.BALLOT;

@Service
public class BallotService {
	
	@Autowired
	private VOTEMapper voteMapper;
	@Autowired
	private USERMapper userMapper;
	
	public void createBallot(BALLOT ballot){
		voteMapper.insert(ballot);
	}
	
	public List<USER> getAllUser(){
		return userMapper.findAllUser();
	}
	
	public List<BALLOT> getAllBallot(){
		return voteMapper.findAllVote();
	}
}
