package com.melot.talkee.agent.service.impl;

import com.alibaba.fastjson.JSONObject;

import com.google.gson.JsonObject;
import com.melot.talkee.agent.constant.TagCodeEnum;
import com.melot.talkee.agent.domain.AgentAccountInfo;
import com.melot.talkee.agent.domain.AgentInfo;
import com.melot.talkee.agent.domain.AgentMenu;
import com.melot.talkee.agent.domain.AgentRelationShip;
import com.melot.talkee.agent.domain.ResultObject;
import com.melot.talkee.agent.domain.TalkAgentTagCodeEnum;
import com.melot.talkee.agent.mapper.AgentAccountInfoMapper;
import com.melot.talkee.agent.mapper.AgentInfoMapper;
import com.melot.talkee.agent.mapper.AgentMenuMapper;
import com.melot.talkee.agent.mapper.AgentRelationShipMapper;
import com.melot.talkee.agent.service.TalkAgentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mn on 2017/11/20.
 */
@Service(value = "talkAgentService")
@Configurable
public class TalkAgentServiceImpl implements TalkAgentService {
    private static Logger logger = LoggerFactory.getLogger(TalkAgentServiceImpl.class);

    @Autowired
    private AgentInfoMapper agentInfoMapper;
    @Autowired
    private AgentMenuMapper agentMenuMapper;
    @Autowired
    private AgentRelationShipMapper agentRelationShipMapper;
    @Autowired
    private AgentAccountInfoMapper agentAccountInfoMapper;
    @Value("${agent.promotionUrl}")
    private String promotionUrl;


    @Override
    public Boolean checkRegisterPhoneNum(String phoneNum) {
        AgentInfo agent=agentInfoMapper.queryByLoginName(phoneNum);
        System.out.println(promotionUrl);
        return agent!=null;
    }


}
