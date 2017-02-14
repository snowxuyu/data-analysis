package com.personal.study.report.repository.yh;

import com.personal.study.report.entity.yh.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yinyafei on 2017/2/13.
 */
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
}
