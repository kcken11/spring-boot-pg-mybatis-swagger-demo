package com.melot.talkee.agent.domain;

import java.io.Serializable;

/**
 * Created by mn on 2017/6/6.
 */
public class ResultObject implements Serializable {

    private static final long serialVersionUID = 6222170154100037105L;

    private Integer total;

    private boolean success;

    private String errorMsg;

    private Object data;
    
    private Object common;
    //错误码提示
    private String errCode;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getCommon() {
        return common;
    }

    public void setCommon(Object common) {
        this.common = common;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
}
