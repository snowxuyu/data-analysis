package com.personal.study.report.repository.mob;

import com.personal.study.report.entity.mob.MobVerifyRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yinyafei on 2017/2/15.
 */
public interface MobVerifyRecordRepository extends JpaRepository<MobVerifyRecord, Long> {

    List<MobVerifyRecord> findByborrowNid(String borrowNid);
}
