package com.personal.study.report.dto;

/**
 * Created by yinyafei on 2017/2/15.
 */
public class VerifyDto {

    private String userId;

    private String borrowNid;

    private String status;

    private String reason;

    private String remark;

    private String amount;

    private String period;

    private String addChannel;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getAddChannel() {
        return addChannel;
    }

    public void setAddChannel(String addChannel) {
        this.addChannel = addChannel;
    }
}
