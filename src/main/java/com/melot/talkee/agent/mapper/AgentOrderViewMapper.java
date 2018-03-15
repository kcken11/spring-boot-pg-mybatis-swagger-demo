package com.melot.talkee.agent.mapper;




import com.melot.talkee.agent.domain.AgentOrderInfo;
import com.melot.talkee.agent.domain.AgentSalaryInfo;
import com.melot.talkee.agent.domain.AgentStudentInfo;
import com.melot.talkee.agent.domain.SubAgentInfo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mn on 2017/11/21.
 */
public interface AgentOrderViewMapper {


    List<AgentOrderInfo> queryAgentOrderList(Map<String, Object> params);

    Integer queryAgentOrderCount(Map<String, Object> params);

    Integer queryAgentSalaryCount(Map<String, Object> params);

    List<AgentSalaryInfo> queryAgentSalaryList(Map<String, Object> params);


    List<SubAgentInfo> getSubAgent(Map<String, Object> agentId);

    List<AgentStudentInfo> getAgentStudent(Map<String, Object> agentId);

    Integer queryAgentCount(Map<String, Object> params);

    List<SubAgentInfo> queryAgentList(Map<String, Object> params);

    Map<String, Long> queryAgentStatusStat(Map<String, Object> params);

    Map<String, Long> queryAgentOrderStat(Map<String, Object> params);

    Map<String, BigDecimal> queryAgentSalaryStat(Map<String, Object> params);

    Integer querySubAgentCount(Integer agentId);

    Integer queryRegisterUserCount(Integer agentId);

    Integer queryMySalaryCount(Integer channelId);

    List<AgentStudentInfo> queryMySalaryList(Map<String, Object> params);

    List<SubAgentInfo> queryAgentListByName(Map<String, Object> params);

    Integer queryAgentStudentCount(Map<String, Object> params);

    HashMap queryAgentStudentStat(Map<String, Object> params);

    List<AgentStudentInfo> queryAgentStudentInfoList(Map<String, Object> params);
}
