package com.personal.study.report.controller;

import com.personal.study.report.dto.DataGridEntity;
import com.personal.study.report.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ReportController {

    @Resource
    private AccountService accountService;


    @RequestMapping("/account")
    public DataGridEntity greeting(String dateBegin, String dateEnd, String phoneNum,
                                   String merchantNo, int page, int rows) {
        return accountService.getAccountInfo(dateBegin, dateEnd, phoneNum, merchantNo, page, rows);
    }
}
