package com.personal.study.report.entity.mob;

import javax.persistence.*;

/**
 * Created by yinyafei on 2017/2/15.
 */
@Entity
@Table(name = "yyd_order_verify_record")
public class MobVerifyRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userId;

    private String borrowNid;

    private String verifyRemark;

    private String reasonFall;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }

    public String getReasonFall() {
        return reasonFall;
    }

    public void setReasonFall(String reasonFall) {
        this.reasonFall = reasonFall;
    }
}
