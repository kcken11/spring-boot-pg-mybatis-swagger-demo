package com.example.demo.service.impl;

import com.example.demo.domain.AdminInfo;
import com.example.demo.mapper.AdminInfoMapper;
import com.example.demo.service.AdminUserService;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mn on 2018/3/14.
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminInfoMapper adminInfoMapper;

    @Override
    public AdminInfo getAdminInfoById(Integer adminId) {
        AdminInfo adminInfo=adminInfoMapper.selectByPrimaryKey(adminId);
        System.out.println(adminInfo.getLoginName());
        return adminInfo;
    }
}
