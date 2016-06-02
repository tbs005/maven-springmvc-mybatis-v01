package com.vcyber.votesystem.dao;

import java.util.List;

import com.vcyber.votesystem.entity.USER;

public interface USERMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(USER record);

    int insertSelective(USER record);

    USER selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(USER record);

    int updateByPrimaryKey(USER record);
    
    USER findUser(USER record);
    
    List<USER> findAllUser();
}