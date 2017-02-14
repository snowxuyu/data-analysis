package com.personal.study.report.service;

import com.personal.study.report.dto.DataGrid;
import com.personal.study.report.dto.OrderDto;
import com.personal.study.report.entity.OrderInfoEntity;
import com.personal.study.report.entity.UserInfoEntity;
import com.personal.study.report.repository.OrderInfoRepository;
import com.personal.study.report.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderInfoRepository orderInfoRepository;
    @Autowired
    private UserInfoRepository userInfoRepository;

    public DataGrid getOrderInfo(String merchantNo, String userId, String status, int page, int rows) {
        PageRequest request = new PageRequest(page - 1, rows, Sort.Direction.DESC, "createTime");
        OrderInfoEntity orderInfoEntity = new OrderInfoEntity();
        if (merchantNo != null && merchantNo.length() != 0 && !merchantNo.equals("-1")) {
            orderInfoEntity.setMerchantsCode(merchantNo);
        }
        if (userId != null && userId.length() != 0) {
            orderInfoEntity.setUserId(userId);
        }
        if (status != null && status.length() != 0 && !status.equals("-1")) {
            orderInfoEntity.setStatus(Integer.parseInt(status));
        }
        Example<OrderInfoEntity> example = Example.of(orderInfoEntity);
        Page<OrderInfoEntity> orderPages = orderInfoRepository.findAll(example, request);
        List list = new ArrayList();
        for (OrderInfoEntity orderInfo : orderPages.getContent()) {
            OrderDto orderDto = new OrderDto();
            orderDto.setCreateTime(orderInfo.getCreateTime());
            orderDto.setMerchantsName(orderInfo.getMerchantsCode());
            orderDto.setUserId(orderInfo.getUserId());
            orderDto.setPeriods(orderInfo.getPeriods().toString());
            orderDto.setOrderCenterNo(orderInfo.getOrderCenterNo());
            orderDto.setStatus(convertOrderStatus(orderInfo.getStatus()));
            orderDto.setOrderAmount(orderInfo.getTotalAmount().toString());

            UserInfoEntity userInfoEntity = getUserInfo(orderDto.getUserId());
            if (userInfoEntity != null) {
                orderDto.setPhoneNum(userInfoEntity.getPhone());
                orderDto.setRealName(userInfoEntity.getRealName());
            }
            list.add(orderDto);
        }
        DataGrid dg = new DataGrid();
        dg.setRows(list);
        dg.setTotal(orderPages.getTotalElements());
        return dg;
    }

    private UserInfoEntity getUserInfo(String userId) {
        if (userId == null || userId.length() == 0) {
            return null;
        }
        UserInfoEntity entity = new UserInfoEntity();
        entity.setUserId(userId);
        Example<UserInfoEntity> example = Example.of(entity);
        UserInfoEntity userInfo = userInfoRepository.findOne(example);
        return userInfo;
    }

    private String convertOrderStatus(int status) {
        String value = "";
        if (status == 0) {
            value = "审核中";
        } else if (status == 1) {
            value = "审核成功";
        } else if (status == 2) {
            value = "审核失败";
        } else if (status == 3) {
            value = "放款成功";
        } else if (status == 4) {
            value = "放款失败";
        } else if (status == 5) {
            value = "还款成功";
        }
        return value;
    }
}
