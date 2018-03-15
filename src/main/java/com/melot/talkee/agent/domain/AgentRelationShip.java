package com.melot.talkee.agent.domain;

import java.io.Serializable;

/**代理关联实体类
 * Created by mn on 2017/11/17.
 */
public class AgentRelationShip implements Serializable {

    private Integer agentId;

    private Integer channelId;

    private Integer departmentId;

    private String departmentName;

    private Integer aId;

    private String ccname;

    private Integer studentId;

    private String cnNickName;

    private String enNickName;

    private Integer parentAgentId;

    private String parentAgentName;

    private Integer parentChannelId;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public String getCnNickName() {
        return cnNickName;
    }

    public void setCnNickName(String cnNickName) {
        this.cnNickName = cnNickName;
    }

    public String getEnNickName() {
        return enNickName;
    }

    public void setEnNickName(String enNickName) {
        this.enNickName = enNickName;
    }

    public String getParentAgentName() {
        return parentAgentName;
    }

    public void setParentAgentName(String parentAgentName) {
        this.parentAgentName = parentAgentName;
    }

    public Integer getParentChannelId() {
        return parentChannelId;
    }

    public void setParentChannelId(Integer parentChannelId) {
        this.parentChannelId = parentChannelId;
    }

    public Integer getParentAgentId() {
        return parentAgentId;
    }

    public void setParentAgentId(Integer parentAgentId) {
        this.parentAgentId = parentAgentId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
