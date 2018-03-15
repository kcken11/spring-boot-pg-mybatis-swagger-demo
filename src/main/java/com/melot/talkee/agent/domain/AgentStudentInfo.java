package com.melot.talkee.agent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mn on 2017/11/20.
 */
public class AgentStudentInfo implements Serializable {


    private Integer userId;

    private Integer agentId;

    private Integer channelId;

    private String cnNickName;

    private String enNickName;

    private String ccname;

    private String crname;

    private String agentName;

    private Date registerTime;

    private String loginName;

    private String introducerLoginName;

    private String introducerCnNickName;

    private String introducerEnNickName;

    private Integer payAmount;

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIntroducerLoginName() {
        return introducerLoginName;
    }

    public void setIntroducerLoginName(String introducerLoginName) {
        this.introducerLoginName = introducerLoginName;
    }

    public String getIntroducerCnNickName() {
        return introducerCnNickName;
    }

    public void setIntroducerCnNickName(String introducerCnNickName) {
        this.introducerCnNickName = introducerCnNickName;
    }

    public String getIntroducerEnNickName() {
        return introducerEnNickName;
    }

    public void setIntroducerEnNickName(String introducerEnNickName) {
        this.introducerEnNickName = introducerEnNickName;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
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

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public String getCrname() {
        return crname;
    }

    public void setCrname(String crname) {
        this.crname = crname;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
}
