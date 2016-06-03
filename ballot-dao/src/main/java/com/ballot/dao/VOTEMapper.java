package com.ballot.dao;

import java.util.List;

import com.ballot.entity.BALLOT;

public interface VOTEMapper {
    int deleteByPrimaryKey(Integer voteId);

    int insert(BALLOT record);

    int insertSelective(BALLOT record);

    BALLOT selectByPrimaryKey(Integer voteId);

    int updateByPrimaryKeySelective(BALLOT record);

    int updateByPrimaryKey(BALLOT record);
    
    List<BALLOT> findAllVote();
}