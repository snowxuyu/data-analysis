package com.personal.study.report.service;

import com.personal.study.report.AccountInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinyafei on 2017/2/9.
 */
@Service
public class AccountService {

    public List getAccountInfo() {
        AccountInfo aif = new AccountInfo();
        aif.setApplyTime("2017-02-09 16:30:30");
        aif.setMerchantName("奢分期");
        aif.setAccountName("张三");
        aif.setPhoneNum("15618688888");
        aif.setAuthStatus("成功");
        aif.setRemark("授信成功");

        AccountInfo aif1 = new AccountInfo();
        aif1.setApplyTime("2017-02-09 16:30:30");
        aif1.setMerchantName("奢分期");
        aif1.setAccountName("张三");
        aif1.setPhoneNum("15618687778");
        aif1.setAuthStatus("失败");
        aif1.setRemark("身份证被占用");

        List list = new ArrayList();
        list.add(aif);
        list.add(aif);
        list.add(aif);
        list.add(aif1);
        list.add(aif);
        list.add(aif);
        list.add(aif);
        return list;
    }
}
