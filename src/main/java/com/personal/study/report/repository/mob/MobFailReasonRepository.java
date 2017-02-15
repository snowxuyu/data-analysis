package com.personal.study.report.repository.mob;

import com.personal.study.report.entity.mob.MobFailReason;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yinyafei on 2017/2/15.
 */
public interface MobFailReasonRepository extends JpaRepository<MobFailReason, Long> {

    MobFailReason findById(Integer id);
}
