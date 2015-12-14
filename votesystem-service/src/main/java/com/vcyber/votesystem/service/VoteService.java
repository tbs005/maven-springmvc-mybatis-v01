package com.vcyber.votesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcyber.votesystem.dao.USERMapper;
import com.vcyber.votesystem.dao.VOTEMapper;
import com.vcyber.votesystem.entity.USER;
import com.vcyber.votesystem.entity.VOTE;

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
