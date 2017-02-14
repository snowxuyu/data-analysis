package com.personal.study.report.repository;

import com.personal.study.report.entity.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yinyafei on 2017/2/13.
 */
public interface OrderInfoRepository extends JpaRepository<OrderInfoEntity, Long> {
}
