package com.melot.talkee.agent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mn on 2017/11/20.
 */
public class SubAgentInfo implements Serializable {

    private String channelId;

    private String agentName;

    private String departmentName;

    private String adminName;

    private Date addTime;

    private Integer status;

    private String fatherAgentName;

    private Integer parentAgentId;

    private Integer parentChannelId;

    private Integer registerCount;

    private Integer subAgentCount;

    private Integer agentId;


    public Integer getParentChannelId() {
        return parentChannelId;
    }

    public void setParentChannelId(Integer parentChannelId) {
        this.parentChannelId = parentChannelId;
    }

    public Integer getAgentId() {
        return agentId;
    }


    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getParentAgentId() {
        return parentAgentId;
    }

    public void setParentAgentId(Integer parentAgentId) {
        this.parentAgentId = parentAgentId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFatherAgentName() {
        return fatherAgentName;
    }

    public void setFatherAgentName(String fatherAgentName) {
        this.fatherAgentName = fatherAgentName;
    }

    public Integer getRegisterCount() {
        return registerCount;
    }

    public void setRegisterCount(Integer registerCount) {
        this.registerCount = registerCount;
    }

    public Integer getSubAgentCount() {
        return subAgentCount;
    }

    public void setSubAgentCount(Integer subAgentCount) {
        this.subAgentCount = subAgentCount;
    }
}
