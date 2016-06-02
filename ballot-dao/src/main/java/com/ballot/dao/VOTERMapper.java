package com.ballot.dao;

import com.ballot.entity.VOTER;

public interface VOTERMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VOTER record);

    int insertSelective(VOTER record);

    VOTER selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VOTER record);

    int updateByPrimaryKey(VOTER record);
}