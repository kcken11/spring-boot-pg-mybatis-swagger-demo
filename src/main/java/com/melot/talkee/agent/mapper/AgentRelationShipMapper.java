package com.melot.talkee.agent.mapper;


import com.melot.talkee.agent.domain.AgentRelationShip;

public interface AgentRelationShipMapper {
    int deleteByPrimaryKey(Integer agentId);

    int insert(AgentRelationShip record);

    int insertSelective(AgentRelationShip record);

    AgentRelationShip selectByPrimaryKey(Integer agentId);

    int updateByPrimaryKeySelective(AgentRelationShip record);

    int updateByPrimaryKey(AgentRelationShip record);
}