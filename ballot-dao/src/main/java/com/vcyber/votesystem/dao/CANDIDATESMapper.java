package com.vcyber.votesystem.dao;

import com.vcyber.votesystem.entity.CANDIDATES;

public interface CANDIDATESMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CANDIDATES record);

    int insertSelective(CANDIDATES record);

    CANDIDATES selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CANDIDATES record);

    int updateByPrimaryKey(CANDIDATES record);
}