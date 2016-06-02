package com.ballot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ballot.dao.USERMapper;
import com.ballot.dao.VOTEMapper;
import com.ballot.entity.USER;
import com.ballot.entity.VOTE;

@Service
public class VoteService {
	
	@Autowired
	private VOTEMapper voteMapper;
	@Autowired
	private USERMapper userMapper;
	
	public void createVote(VOTE vote){
		voteMapper.insert(vote);
	}
	
	public List<USER> getAllUser(){
		return userMapper.findAllUser();
	}
	
	public List<VOTE> getAllVote(){
		return voteMapper.findAllVote();
	}
}
