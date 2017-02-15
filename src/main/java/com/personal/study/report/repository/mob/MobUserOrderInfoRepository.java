package com.personal.study.report.repository.mob;

import com.personal.study.report.entity.mob.MobUserOrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yinyafei on 2017/2/15.
 */
public interface MobUserOrderInfoRepository extends JpaRepository<MobUserOrderInfo, Long> {

    MobUserOrderInfo findByBorrowNid(String borrowNid);
}
