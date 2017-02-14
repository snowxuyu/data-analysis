package com.personal.study.report.service;

import com.personal.study.report.dto.AccountDto;
import com.personal.study.report.dto.DataGrid;
import com.personal.study.report.entity.yh.BasicInfoEntity;
import com.personal.study.report.repository.yh.BasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    public DataGrid getAccountInfo(String phoneNum, String merchantNo, int page, int rows) {
        PageRequest request = new PageRequest(page - 1, rows, Sort.Direction.DESC, "createTime");
        BasicInfoEntity b = new BasicInfoEntity();
        if (merchantNo != null && !merchantNo.equals("-1")) {
            b.setMerchantsNo(merchantNo);
        }
        if (phoneNum != null && phoneNum.length() != 0) {
            b.setPhoneNum(phoneNum);
        }
        Example<BasicInfoEntity> basicInfoExample = Example.of(b);
        Page<BasicInfoEntity> basicInfoPage = basicInfoRepository.findAll(basicInfoExample, request);

        DataGrid dg = new DataGrid();
        List list = new ArrayList();
        for (BasicInfoEntity basicInfoEntity : basicInfoPage.getContent()) {
            AccountDto aif = new AccountDto();
            aif.setApplyTime(basicInfoEntity.getCreateTime());
            aif.setMerchantName(basicInfoEntity.getMerchantsNo());
            aif.setAccountName(basicInfoEntity.getRealName());
            aif.setPhoneNum(basicInfoEntity.getPhoneNum());
            int authStatus = basicInfoEntity.getAuthStatus();
            if (authStatus == 0) {
                aif.setAuthStatus("失败");
            } else {
                aif.setAuthStatus("成功");
            }
            aif.setRemark(basicInfoEntity.getRemark());
            list.add(aif);
        }
        dg.setRows(list);
        dg.setTotal(basicInfoPage.getTotalElements());
        return dg;
    }
}
