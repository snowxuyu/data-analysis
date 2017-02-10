package com.personal.study.report.service;

import com.personal.study.report.dto.AccountInfo;
import com.personal.study.report.dto.DataGridEntity;
import com.personal.study.report.entity.BasicInfo;
import com.personal.study.report.repository.BasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yinyafei on 2017/2/9.
 */
@Service
public class AccountService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    public DataGridEntity getAccountInfo(String dateBegin, String dateEnd, String phoneNum,
                                         String merchantNo, int page, int rows) {
        PageRequest request = new PageRequest(page - 1, rows, Sort.Direction.DESC, "createTime");
        BasicInfo b = new BasicInfo();
        b.setMerchantsNo(merchantNo);
        if (phoneNum != null && phoneNum.length() != 0) {
            b.setPhoneNum(phoneNum);
        }
        Example<BasicInfo> basicInfoExample = Example.of(b);
        Page<BasicInfo> pageInfo = basicInfoRepository.findAll(basicInfoExample, request);

        DataGridEntity dgEntity = new DataGridEntity();
        List list = new ArrayList();
        for (BasicInfo basicInfo : pageInfo.getContent()) {
            AccountInfo aif = new AccountInfo();
            aif.setApplyTime(basicInfo.getCreateTime());
            aif.setMerchantName(basicInfo.getMerchantsNo());
            aif.setAccountName(basicInfo.getRealName());
            aif.setPhoneNum(basicInfo.getPhoneNum());
            int authStatus = basicInfo.getAuthStatus();
            if (authStatus == 0) {
                aif.setAuthStatus("失败");
            } else {
                aif.setAuthStatus("成功");
            }
            aif.setRemark(basicInfo.getRemark());
            list.add(aif);
        }
        dgEntity.setRows(list);
        dgEntity.setTotal(pageInfo.getTotalElements());
        return dgEntity;
    }
}
