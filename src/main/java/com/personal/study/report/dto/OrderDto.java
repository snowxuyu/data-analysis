package com.personal.study.report.dto;

/**
 * Created by yinyafei on 2017/2/13.
 */
public class OrderDto {

    private String createTime;
    private String merchantsName;
    private String phoneNum;
    private String userId;
    private String realName;
    private String orderAmount;
    private String periods;
    private String orderCenterNo;
    private String status;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMerchantsName() {
        return merchantsName;
    }

    public void setMerchantsName(String merchantsName) {
        this.merchantsName = merchantsName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPeriods() {
        return periods;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }

    public String getOrderCenterNo() {
        return orderCenterNo;
    }

    public void setOrderCenterNo(String orderCenterNo) {
        this.orderCenterNo = orderCenterNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
