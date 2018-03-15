package com.melot.talkee.agent.domain;

import java.io.Serializable;

/**
 * Created by mn on 2017/11/21.
 */
public class AgentSalaryInfo implements Serializable {

    private Integer agentId;

    private String channelId;

    private String agentName;

    private String departmentName;

    private String ccname;

    private Integer registerCount;

    private Integer newOrderCount;

    private long newOrderAmount;

    private Integer renewOrderCount;

    private long renewOrderAmount;

    private String month;

    private String phoneNum;

    private String accountAddress;

    private String accountName;

    private String accountNo;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

    public Integer getRegisterCount() {
        return registerCount;
    }

    public void setRegisterCount(Integer registerCount) {
        this.registerCount = registerCount;
    }

    public Integer getNewOrderCount() {
        return newOrderCount;
    }

    public void setNewOrderCount(Integer newOrderCount) {
        this.newOrderCount = newOrderCount;
    }

    public long getNewOrderAmount() {
        return newOrderAmount;
    }

    public void setNewOrderAmount(long newOrderAmount) {
        this.newOrderAmount = newOrderAmount;
    }

    public Integer getRenewOrderCount() {
        return renewOrderCount;
    }

    public void setRenewOrderCount(Integer renewOrderCount) {
        this.renewOrderCount = renewOrderCount;
    }

    public long getRenewOrderAmount() {
        return renewOrderAmount;
    }

    public void setRenewOrderAmount(long renewOrderAmount) {
        this.renewOrderAmount = renewOrderAmount;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
