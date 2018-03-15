package com.melot.talkee.agent.service;


import com.melot.talkee.agent.domain.ResultObject;

import java.util.ArrayList;

/**
 * Created by mn on 2017/11/17.
 */
public interface TalkAgentManagerService {

    ResultObject getAgentOrderList(Integer agentId, Integer departmentId, ArrayList<Integer> ccIds, String startDate, String endDate, Integer current, Integer pageSize);

    ResultObject getAgentSalary(Integer agentId, Integer departmentId, String month, ArrayList<Integer> ccIds, Integer current, Integer pageSize, boolean export);

    ResultObject getAgentList(String startDate, String endDate, Integer departmentId, ArrayList<Integer> ccIds, Integer agentId, Integer current, Integer pageSize, Integer status);


    ResultObject getSubAgentList(Integer agentId, Integer current, Integer pageSize);


    ResultObject getAgentStudents(Integer agentId, Integer current, Integer pageSize);

   ResultObject getMySalaryList(Integer agentId, Integer current, Integer pageSize);

   ResultObject queryAgentName(String agentName);


   ResultObject getAgentStudentList(Integer channelId, String startDate, String endDate, String queryKey, Integer current, Integer pageSize);
}
