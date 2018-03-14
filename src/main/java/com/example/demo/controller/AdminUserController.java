package com.example.demo.controller;

import com.example.demo.domain.AdminInfo;
import com.example.demo.domain.ResponseResult;
import com.example.demo.service.AdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mn on 2018/3/14.
 */
@RestController
@Api(basePath = "/agent",value = "员工相关Controller")

public class AdminUserController {
    @Autowired
    private AdminUserService adminUserService;
    @ApiOperation(value = "根据id获取admin基本信息",notes = "")
    @RequestMapping(value = "/admin/user", method = RequestMethod.GET)
    public ResponseResult getAdminInfo(@RequestParam("aid") Integer aid) {
        ResponseResult result = new ResponseResult();
        try {
            AdminInfo adminInfo = adminUserService.getAdminInfoById(aid);
            result.setData(adminInfo);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setErrorcode("000001");
        }
        return result;
    }

    @RequestMapping(value = "/admin/user", method = RequestMethod.POST)
    public AdminInfo updateAdminInfo(@RequestParam("aid") Integer aid) {
        System.out.println("update admin");
        AdminInfo adminInfo = adminUserService.getAdminInfoById(aid);
        return adminInfo;
    }
}
