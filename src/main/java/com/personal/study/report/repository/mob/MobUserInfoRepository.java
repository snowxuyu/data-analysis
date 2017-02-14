package com.personal.study.report.repository.mob;

import com.personal.study.report.dto.MobUserDto;
import com.personal.study.report.entity.mob.MobUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yinyafei on 2017/2/14.
 */
public interface MobUserInfoRepository extends JpaRepository<MobUserInfo, Long> {
}
