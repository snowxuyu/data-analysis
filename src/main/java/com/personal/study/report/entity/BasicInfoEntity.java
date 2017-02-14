package com.personal.study.report.entity;


import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "t_basic_info")
public class BasicInfoEntity {

    public Integer getId() {
        return id;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String createTime;

    /**
     * 用户手机号
     */
    private String phoneNum;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 身份证号
     */
    private String identityCard;
    /**
     * 常住地址省
     */
    private String province;
    /**
     * 常住地址市
     */
    private String city;
    /**
     * 常住地址区
     */
    private String district;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 学历
     */
    private String edu;
    /**
     * 婚姻
     */
    private String marriage;
    /**
     * 银行卡号
     */
    private String bankcardNum;
    /**
     * 开户行
     */
    private String bankName;
    /**
     * 商户号
     */
    @Column(name = "merchants_no")
    private String merchantsNo;
    /**
     * 授信状态 0：失败 1：成功
     */
    private Integer authStatus;
    /**
     * 有效标志 0：无效  1：有效
     */
    private Integer status;
    /**
     * 是否是手机贷用户
     */
    private Integer isUcdai;
    /**
     * 备注
     */
    private String remark;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getBankcardNum() {
        return bankcardNum;
    }

    public void setBankcardNum(String bankcardNum) {
        this.bankcardNum = bankcardNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getMerchantsNo() {
        return merchantsNo;
    }

    public void setMerchantsNo(String merchantsNo) {
        this.merchantsNo = merchantsNo;
    }

    public Integer getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsUcdai() {
        return isUcdai;
    }

    public void setIsUcdai(Integer isUcdai) {
        this.isUcdai = isUcdai;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}