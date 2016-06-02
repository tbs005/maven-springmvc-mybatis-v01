package com.vcyber.votesystem.dao;

import com.vcyber.votesystem.entity.VOTER;

public interface VOTERMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VOTER record);

    int insertSelective(VOTER record);

    VOTER selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VOTER record);

    int updateByPrimaryKey(VOTER record);
}