package com.melot.talkee.agent.controller;

import com.melot.talkee.agent.domain.ResponseResult;
import com.melot.talkee.agent.service.TalkAgentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mn on 2018/3/15.
 */
@RestController
@Api("代理商相关操作")
public class AgentController {
    @Autowired
    private TalkAgentService talkAgentService;

    @RequestMapping(value = "/check/phone",method = RequestMethod.GET)
    @ApiOperation(value = "校验手机号是否已存在", notes = "exist:true/fase")
    public ResponseResult checkAgentPhoneNum(@RequestParam("phone") String phone) {
        ResponseResult responseResult = new ResponseResult();
        try {
            boolean exist = talkAgentService.checkRegisterPhoneNum(phone);
            responseResult.setData(exist);
            responseResult.setSuccess(true);
        } catch (Exception e) {
           responseResult.setSuccess(false);
           responseResult.setErrorMsg(e.getLocalizedMessage());
        }
        return responseResult;
    }

}
