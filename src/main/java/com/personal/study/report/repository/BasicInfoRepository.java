package com.personal.study.report.repository;

import com.personal.study.report.entity.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by yinyafei on 2017/2/10.
 */
public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {

}
