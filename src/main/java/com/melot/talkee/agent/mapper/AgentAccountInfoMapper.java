package com.melot.talkee.agent.mapper;


import com.melot.talkee.agent.domain.AgentAccountInfo;

public interface AgentAccountInfoMapper  {

    int insertSelective(AgentAccountInfo record);

    AgentAccountInfo selectByPrimaryKey(Integer agentId);


    int updateByPrimaryKeySelective(AgentAccountInfo agentAccountInfo);
}