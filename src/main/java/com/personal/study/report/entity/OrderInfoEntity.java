package com.personal.study.report.entity;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_order")
public class OrderInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String createTime;
    private String updateTime;
    private String userId;
    private String merchantsCode;
    private String channelSource;
    private BigDecimal totalAmount;
    private BigDecimal downPayment;
    private BigDecimal borrowAmount;
    private Integer status;
    private String remark;
    private Integer periods;
    private BigDecimal monthlyFee;
    private BigDecimal shouldRepay;
    private BigDecimal shouldRepay2;
    private BigDecimal shouldRepay3;
    private BigDecimal shouldRepay4;
    private String firstRefundDate;
    private String orderCenterNo;
    private String yhOrderNo;
    private String syncStatus;
    private String addressId;
    private String subStatus;
    private String checkStatus;
    private String merchantsOrderNo;
    private String merchantsFeeId;
    private String merchantsFeeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMerchantsCode() {
        return merchantsCode;
    }

    public void setMerchantsCode(String merchantsCode) {
        this.merchantsCode = merchantsCode;
    }

    public String getChannelSource() {
        return channelSource;
    }

    public void setChannelSource(String channelSource) {
        this.channelSource = channelSource;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(BigDecimal downPayment) {
        this.downPayment = downPayment;
    }

    public BigDecimal getBorrowAmount() {
        return borrowAmount;
    }

    public void setBorrowAmount(BigDecimal borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(BigDecimal monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public BigDecimal getShouldRepay() {
        return shouldRepay;
    }

    public void setShouldRepay(BigDecimal shouldRepay) {
        this.shouldRepay = shouldRepay;
    }

    public BigDecimal getShouldRepay2() {
        return shouldRepay2;
    }

    public void setShouldRepay2(BigDecimal shouldRepay2) {
        this.shouldRepay2 = shouldRepay2;
    }

    public BigDecimal getShouldRepay3() {
        return shouldRepay3;
    }

    public void setShouldRepay3(BigDecimal shouldRepay3) {
        this.shouldRepay3 = shouldRepay3;
    }

    public BigDecimal getShouldRepay4() {
        return shouldRepay4;
    }

    public void setShouldRepay4(BigDecimal shouldRepay4) {
        this.shouldRepay4 = shouldRepay4;
    }

    public String getFirstRefundDate() {
        return firstRefundDate;
    }

    public void setFirstRefundDate(String firstRefundDate) {
        this.firstRefundDate = firstRefundDate;
    }

    public String getOrderCenterNo() {
        return orderCenterNo;
    }

    public void setOrderCenterNo(String orderCenterNo) {
        this.orderCenterNo = orderCenterNo;
    }

    public String getYhOrderNo() {
        return yhOrderNo;
    }

    public void setYhOrderNo(String yhOrderNo) {
        this.yhOrderNo = yhOrderNo;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getMerchantsOrderNo() {
        return merchantsOrderNo;
    }

    public void setMerchantsOrderNo(String merchantsOrderNo) {
        this.merchantsOrderNo = merchantsOrderNo;
    }

    public String getMerchantsFeeId() {
        return merchantsFeeId;
    }

    public void setMerchantsFeeId(String merchantsFeeId) {
        this.merchantsFeeId = merchantsFeeId;
    }

    public String getMerchantsFeeName() {
        return merchantsFeeName;
    }

    public void setMerchantsFeeName(String merchantsFeeName) {
        this.merchantsFeeName = merchantsFeeName;
    }
}