package com.vcyber.votesystem.dao;

import java.util.List;

import com.vcyber.votesystem.entity.VOTE;

public interface VOTEMapper {
    int deleteByPrimaryKey(Integer voteId);

    int insert(VOTE record);

    int insertSelective(VOTE record);

    VOTE selectByPrimaryKey(Integer voteId);

    int updateByPrimaryKeySelective(VOTE record);

    int updateByPrimaryKey(VOTE record);
    
    List<VOTE> findAllVote();
}