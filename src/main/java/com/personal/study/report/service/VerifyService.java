package com.personal.study.report.service;

import com.personal.study.report.dto.DataGrid;
import com.personal.study.report.dto.VerifyDto;
import com.personal.study.report.entity.mob.MobFailReason;
import com.personal.study.report.entity.mob.MobUserOrderInfo;
import com.personal.study.report.entity.mob.MobVerifyRecord;
import com.personal.study.report.repository.mob.MobFailReasonRepository;
import com.personal.study.report.repository.mob.MobUserOrderInfoRepository;
import com.personal.study.report.repository.mob.MobVerifyRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinyafei on 2017/2/15.
 */
@Service
public class VerifyService {

    @Autowired
    private MobVerifyRecordRepository mobVerifyRecordRepository;
    @Autowired
    private MobUserOrderInfoRepository mobUserOrderInfoRepository;
    @Autowired
    private MobFailReasonRepository mobFailReasonRepository;

    public DataGrid getVerifyInfo(String borrowNid) {
        MobUserOrderInfo mobUserOrderInfo = mobUserOrderInfoRepository.findByBorrowNid(borrowNid);
        List list = new ArrayList();
        if (mobUserOrderInfo != null) {
            VerifyDto verifyDto = new VerifyDto();
            verifyDto.setUserId(mobUserOrderInfo.getUserId());
            verifyDto.setAmount(mobUserOrderInfo.getAmount());
            verifyDto.setAddChannel(mobUserOrderInfo.getAddChannel());
            verifyDto.setPeriod(mobUserOrderInfo.getPeriod());
            verifyDto.setStatus(convertOrderStatus(mobUserOrderInfo.getStatus()));
            verifyDto.setBorrowNid(borrowNid);

            List<MobVerifyRecord> mrList = mobVerifyRecordRepository.findByborrowNid(borrowNid);
            for (MobVerifyRecord record : mrList) {
                String reasonFallId = record.getReasonFall();
                if (!"0".equals(reasonFallId)) {
                    MobFailReason mobFailReason = mobFailReasonRepository.findById(Integer.parseInt(reasonFallId));
                    verifyDto.setRemark(record.getVerifyRemark());
                    verifyDto.setReason(mobFailReason.getReasonName());
                    break;
                }
            }
            list.add(verifyDto);
        }
        DataGrid dataGrid = new DataGrid();
        dataGrid.setTotal(1);
        dataGrid.setRows(list);
        return dataGrid;
    }

    private String convertOrderStatus(String status) {
        String value = "";
        int statusInt = Integer.parseInt(status);
        switch (statusInt) {
            case 0:
                value = "待审核";
                break;
            case 1:
                value = "初审通过";
                break;
            case 2:
                value = "初审拒绝";
                break;
            case 3:
                value = "终审通过";
                break;
            case 4:
                value = "终审拒绝";
                break;
            case 5:
                value = "复核通过";
                break;
            case 6:
                value = "复核拒绝";
                break;
            case 11:
                value = "准入拒绝";
                break;
        }
        return value;
    }
}
