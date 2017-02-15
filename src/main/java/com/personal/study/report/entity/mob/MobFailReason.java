package com.personal.study.report.entity.mob;

import javax.persistence.*;

/**
 * Created by yinyafei on 2017/2/15.
 */
@Entity
@Table(name = "yyd_reason_fall")
public class MobFailReason {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String reasonName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }
}
