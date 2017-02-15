package com.personal.study.report.entity.mob;

import javax.persistence.*;

/**
 * Created by yinyafei on 2017/2/15.
 */
@Entity
@Table(name = "yyd_order_info")
public class MobUserOrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userId;

    private String status;

    private String amount;

    private String period;

    private String addChannel;

    private String borrowNid;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getBorrowNid() {
        return borrowNid;
    }

    public void setBorrowNid(String borrowNid) {
        this.borrowNid = borrowNid;
    }
}
