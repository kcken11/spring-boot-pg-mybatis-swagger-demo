package com.melot.talkee.agent.service.impl;

import com.alibaba.fastjson.JSONObject;

import com.melot.talkee.agent.constant.TagCodeEnum;
import com.melot.talkee.agent.domain.*;
import com.melot.talkee.agent.mapper.AgentOrderViewMapper;
import com.melot.talkee.agent.mapper.AgentRelationShipMapper;
import com.melot.talkee.agent.service.TalkAgentManagerService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mn on 2017/11/20.
 */
public class TalkAgentManagerServiceImpl implements TalkAgentManagerService {

    private static Logger logger = LoggerFactory.getLogger(TalkAgentManagerServiceImpl.class);
    @Autowired
    private AgentOrderViewMapper agentOrderViewMapper;
    @Autowired
    private AgentRelationShipMapper agentRelationShipMapper;

    /**
     * 获取订单明细
     *
     * @param agentId
     * @param departmentId
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public ResultObject getAgentOrderList(Integer agentId, Integer departmentId, ArrayList<Integer> ccIds, String startDate, String endDate, Integer current, Integer pageSize) {

        ResultObject result = new ResultObject();
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("agentId", agentId);
            params.put("departmentId", departmentId);
            params.put("ccIds", ccIds);
            if (StringUtils.isNotBlank(startDate)) {
              //  params.put("startDate", DateUtil.parseDateStringToDate(startDate + " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
            }
            if (StringUtils.isNotBlank(endDate)) {
               // params.put("endDate", DateUtil.parseDateStringToDate(endDate + " 23:59:59", "yyyy-MM-dd HH:mm:ss"));
            }

            Integer total = agentOrderViewMapper.queryAgentOrderCount(params);
            if (total == 0) {
                result.setData(new ArrayList<>());
                result.setTotal(0);
                result.setSuccess(true);
                return result;
            }
            if (current != null && pageSize != null) {
                params.put("limit", pageSize);
                params.put("offset", (current - 1) * pageSize);
            }
            List<AgentOrderInfo> orderList = agentOrderViewMapper.queryAgentOrderList(params);
            Map<String, Long> stat = agentOrderViewMapper.queryAgentOrderStat(params);
            JSONObject data = new JSONObject();
            data.put("rows", orderList);
            data.put("newOrderAmount", stat.get("neworderamount").intValue());
            data.put("renewOrderAmount", stat.get("reneworderamount").intValue());
            result.setData(data);
            result.setTotal(total);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setErrCode(TagCodeEnum.EXECSQL_EXCEPTION);
        }
        return result;
    }

    @Override
    public ResultObject getAgentSalary(Integer agentId, Integer departmentId, String month, ArrayList<Integer> ccIds, Integer current, Integer pageSize, boolean export) {
        ResultObject result = new ResultObject();
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("agentId", agentId);
            params.put("departmentId", departmentId);
            params.put("month", month);
            params.put("ccIds", ccIds);
            params.put("export", export);
            Integer total = agentOrderViewMapper.queryAgentSalaryCount(params);
            if (total == 0) {
                result.setData(new ArrayList<>());
                result.setTotal(0);
                result.setSuccess(true);
                return result;
            }
            if (current != null && pageSize != null) {
                params.put("limit", pageSize);
                params.put("offset", (current - 1) * pageSize);
            }
            List<AgentSalaryInfo> salaryList = agentOrderViewMapper.queryAgentSalaryList(params);

            Map<String, BigDecimal> stat = agentOrderViewMapper.queryAgentSalaryStat(params);
            JSONObject data = new JSONObject();
            data.put("rows", salaryList);
            data.put("newAmount", stat.get("newamount").intValue());
            data.put("renewOrderAmount", stat.get("reneworderamount").intValue());
            data.put("registerCount", stat.get("registercount").intValue());
            result.setData(data);
            result.setTotal(total);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setErrCode(TagCodeEnum.EXECSQL_EXCEPTION);
        }
        return result;
    }

    @Override
    public ResultObject getAgentList(String startDate, String endDate, Integer departmentId, ArrayList<Integer> ccIds, Integer agentId, Integer current, Integer pageSize, Integer status) {
        ResultObject result = new ResultObject();

        try {
            Map<String, Object> params = new HashMap<>();
            params.put("status", status);
            params.put("departmentId", departmentId);
            params.put("ccIds", ccIds);
            params.put("agentId", agentId);
            if (StringUtils.isNotBlank(startDate)) {
               // params.put("startDate", DateUtil.parseDateStringToDate(startDate + " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
            }
            if (StringUtils.isNotBlank(endDate)) {
               // params.put("endDate", DateUtil.parseDateStringToDate(endDate + " 23:59:59", "yyyy-MM-dd HH:mm:ss"));
            }

            Integer total = agentOrderViewMapper.queryAgentCount(params);
            if (total == 0) {
                result.setData(new ArrayList<>());
                result.setTotal(0);
                result.setSuccess(true);
                return result;
            }
            if (current != null && pageSize != null) {
                params.put("limit", pageSize);
                params.put("offset", (current - 1) * pageSize);
            }
            List<SubAgentInfo> agentList = agentOrderViewMapper.queryAgentList(params);

            Map<String, Long> stat = agentOrderViewMapper.queryAgentStatusStat(params);


            JSONObject data = new JSONObject();
            data.put("rows", agentList);
            data.put("validCount", stat.get("validcount").intValue());
            data.put("invalidCount", stat.get("invalidcount").intValue());
            result.setData(data);
            result.setTotal(total);
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setSuccess(false);
            result.setErrCode(TagCodeEnum.EXECSQL_EXCEPTION);
        }

        return result;
    }

    @Override
    public ResultObject getSubAgentList(Integer agentId, Integer current, Integer pageSize) {
        ResultObject result = new ResultObject();
        Integer count = agentOrderViewMapper.querySubAgentCount(agentId);
        if (count == null) {
            result.setData(new ArrayList<>());
            result.setTotal(0);
            result.setSuccess(true);
            return result;
        } else {
            Map<String, Object> params = new HashMap<>();
            if (current != null && pageSize != null) {
                params.put("agentId", agentId);
                params.put("limit", pageSize);
                params.put("offset", (current - 1) * pageSize);
            }
            List<SubAgentInfo> subAgents = agentOrderViewMapper.getSubAgent(params);

            result.setData(subAgents);
            result.setSuccess(true);
            result.setTotal(count);
            return result;
        }

    }

    @Override
    public ResultObject getMySalaryList(Integer agentId, Integer current, Integer pageSize) {
        ResultObject result = new ResultObject();
        AgentRelationShip relationShip = agentRelationShipMapper.selectByPrimaryKey(agentId);
        Integer channelId = relationShip.getChannelId();
        Integer count = agentOrderViewMapper.queryMySalaryCount(channelId);
        if (count == null) {
            result.setData(new ArrayList<>());
            result.setTotal(0);
            result.setSuccess(true);
            return result;
        } else {
            Map<String, Object> params = new HashMap<>();
            params.put("channelId", channelId);
            if (current != null && pageSize != null) {

                params.put("limit", pageSize);
                params.put("offset", (current - 1) * pageSize);
            }
            List<AgentStudentInfo> subAgents = agentOrderViewMapper.queryMySalaryList(params);
            result.setData(subAgents);
            result.setSuccess(true);
            result.setTotal(count);
            return result;
        }

    }

    @Override
    public ResultObject queryAgentName(String agentName) {
        ResultObject result = new ResultObject();
        Map<String, Object> params = new HashMap<>();
        if(StringUtils.isNotBlank(agentName)){
          params.put("agentName",agentName.trim().toUpperCase());
          if(StringUtils.isNumeric(agentName.trim())){
            params.put("channelId", Integer.valueOf(agentName.trim()));
          }
        }
        List<SubAgentInfo> agentlist = agentOrderViewMapper.queryAgentListByName(params);

        result.setData(agentlist);
        result.setSuccess(true);
        return result;
    }

    @Override
    public ResultObject getAgentStudentList(Integer channelId, String startDate, String endDate, String queryKey, Integer current, Integer pageSize) {
        ResultObject result = new ResultObject();
        JSONObject data = new JSONObject();
        Map<String, Object> params = new HashMap();
        AgentRelationShip relationShip=agentRelationShipMapper.selectByPrimaryKey(channelId);
        params.put("channelId",relationShip.getChannelId());
        if (StringUtils.isNotBlank(queryKey)) {
            params.put("queryKey", queryKey.trim().toUpperCase());
        }
        if (StringUtils.isNotBlank(startDate)) {
           // params.put("startDate", DateUtil.parseDateStringToDate(startDate + " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
        }
        if (StringUtils.isNotBlank(endDate)) {
           // params.put("endDate", DateUtil.parseDateStringToDate(endDate + " 23:59:59", "yyyy-MM-dd HH:mm:ss"));
        }


        HashMap<String,Object> stat = agentOrderViewMapper.queryAgentStudentStat(params);
        Integer count = agentOrderViewMapper.queryAgentStudentCount(params);
        if (count == 0) {
            data.put("stat", stat);
            data.put("rows", new ArrayList<>());
            result.setSuccess(true);
            result.setData(data);
            return result;
        }
        if (current != null && pageSize != null) {
            params.put("limit", pageSize);
            params.put("offset", (current - 1) * pageSize);
        }

        List<AgentStudentInfo> students = agentOrderViewMapper.queryAgentStudentInfoList(params);

        //隐藏敏感信息
        for (AgentStudentInfo student : students) {
            student.setLoginName(encryptLoginName(student.getLoginName()));
            student.setIntroducerLoginName(encryptLoginName(student.getIntroducerLoginName()));
        }


        data.put("stat", stat);
        data.put("rows", students);
        result.setData(data);
        result.setSuccess(true);
        result.setTotal(count);
        return result;
    }

    public String encryptLoginName(String loginName) {
        if (StringUtils.isNotBlank(loginName)) {
            if (loginName.indexOf("@") > -1) {
                loginName = loginName.substring(0, 1) + "****" + loginName.substring(loginName.lastIndexOf("@"), loginName.length());
            } else {
                loginName = loginName.substring(0, 3) + "****" + loginName.substring(loginName.length() - 4, loginName.length());
            }
            return loginName;
        }
        return null;
    }

    @Override
    public ResultObject getAgentStudents(Integer agentId, Integer current, Integer pageSize) {
        ResultObject result = new ResultObject();
        Integer count = agentOrderViewMapper.queryRegisterUserCount(agentId);
        if (count == null) {
            result.setData(new ArrayList<>());
            result.setTotal(0);
            result.setSuccess(true);
            return result;
        } else {
            Map<String, Object> params = new HashMap<>();
            if (current != null && pageSize != null) {
                params.put("agentId", agentId);
                params.put("limit", pageSize);
                params.put("offset", (current - 1) * pageSize);
            }
            List<AgentStudentInfo> subAgents = agentOrderViewMapper.getAgentStudent(params);
            result.setData(subAgents);
            result.setTotal(count);
            result.setSuccess(true);
            return result;
        }

    }

}
