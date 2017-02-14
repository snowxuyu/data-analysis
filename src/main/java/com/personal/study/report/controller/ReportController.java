package com.personal.study.report.controller;

import com.personal.study.report.dto.DataGrid;
import com.personal.study.report.service.AccountService;
import com.personal.study.report.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/page")
public class ReportController {

    @Resource
    private AccountService accountService;
    @Resource
    private OrderService orderService;

    @RequestMapping("/account")
    public DataGrid getAccountInfo(String dateBegin, String dateEnd, String phoneNum,
                                   String merchantNo, int page, int rows) {
        return accountService.getAccountInfo(dateBegin, dateEnd, phoneNum, merchantNo, page, rows);
    }

    @RequestMapping("/order")
    public DataGrid getOrderInfo(String merchantNo, String userId, String status, int page, int rows) {
        return orderService.getOrderInfo(merchantNo, userId, status, page, rows);
    }
}
