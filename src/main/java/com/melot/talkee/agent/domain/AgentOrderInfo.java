package com.melot.talkee.agent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *  订单明细实体类
 * Created by mn on 2017/11/21.
 */
public class AgentOrderInfo implements Serializable {
    private Integer agentId;

    private String channelId;

    private Date affirmTime;

    private String cnNickName;

    private String enNickName;

    private String orderId;

    private Integer tradeOrderType;

    private Integer amount;

    private String agentName;

    private String departmentName;

    private String ccname;

    private String parentAgentName;

    private String parentChannelId;

    public String getParentChannelId() {
        return parentChannelId;
    }

    public void setParentChannelId(String parentChannelId) {
        this.parentChannelId = parentChannelId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Date getAffirmTime() {
        return affirmTime;
    }

    public void setAffirmTime(Date affirmTime) {
        this.affirmTime = affirmTime;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getTradeOrderType() {
        return tradeOrderType;
    }

    public void setTradeOrderType(Integer tradeOrderType) {
        this.tradeOrderType = tradeOrderType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public String getParentAgentName() {
        return parentAgentName;
    }

    public void setParentAgentName(String parentAgentName) {
        this.parentAgentName = parentAgentName;
    }
}
