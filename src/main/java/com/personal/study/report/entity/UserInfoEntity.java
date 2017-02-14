package com.personal.study.report.entity;

import javax.persistence.*;

/**
 * Created by yinyafei on 2017/2/13.
 */

@Entity
@Table(name = "t_user")
public class UserInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String userId;
    private String phone;
    private String realName;
    private String idCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
