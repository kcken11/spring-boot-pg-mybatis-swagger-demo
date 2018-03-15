package com.melot.talkee.agent.mapper;

import com.melot.talkee.agent.domain.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}