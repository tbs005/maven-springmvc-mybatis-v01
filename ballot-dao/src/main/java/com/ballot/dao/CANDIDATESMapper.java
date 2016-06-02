package com.ballot.dao;

import com.ballot.entity.CANDIDATES;

public interface CANDIDATESMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CANDIDATES record);

    int insertSelective(CANDIDATES record);

    CANDIDATES selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CANDIDATES record);

    int updateByPrimaryKey(CANDIDATES record);
}