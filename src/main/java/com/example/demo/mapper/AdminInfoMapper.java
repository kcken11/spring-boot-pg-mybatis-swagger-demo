package com.example.demo.mapper;

import com.example.demo.domain.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}