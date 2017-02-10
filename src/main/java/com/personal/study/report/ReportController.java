package com.personal.study.report;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.personal.study.report.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ReportController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account")
    public DataGridEntity greeting(String dateBegin, String dateEnd, String phoneNum,
                                   String merchantNo, int page, String pageSize) {
        List list = accountService.getAccountInfo();
        DataGridEntity dgEntity = new DataGridEntity();
        dgEntity.setTotal(50);
        dgEntity.setRows(list);
        return dgEntity;
    }
}
