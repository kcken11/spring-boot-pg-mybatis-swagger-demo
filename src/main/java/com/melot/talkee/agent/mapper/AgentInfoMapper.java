package com.melot.talkee.agent.mapper;


import com.melot.talkee.agent.domain.AgentInfo;

import java.util.Map;

public interface AgentInfoMapper  {


    int insertSelective(AgentInfo record);

    AgentInfo selectByPrimaryKey(Integer agentId);

    int updateByPrimaryKeySelective(AgentInfo record);


    AgentInfo queryByLoginName(String loginName);

    AgentInfo checkUnique(Map<String, Object> params);
}