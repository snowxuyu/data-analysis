package com.personal.study.report.service;

import com.personal.study.report.dto.DataGrid;
import com.personal.study.report.entity.mob.MobCreditAmount;
import com.personal.study.report.dto.MobUserDto;
import com.personal.study.report.entity.mob.MobUserInfo;
import com.personal.study.report.repository.mob.MobCreditAmountRepository;
import com.personal.study.report.repository.mob.MobUserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinyafei on 2017/2/14.
 */
@Service
public class MobUserService {

    @Autowired
    private MobUserInfoRepository mobUserInfoRepository;
    @Autowired
    private MobCreditAmountRepository mobCreditAmountRepository;

    public DataGrid getMobuserInfo(String phoneNum) {
        DataGrid dg = new DataGrid();
        if (phoneNum != null && phoneNum.length() != 0) {
            MobUserInfo findParams = new MobUserInfo();
            findParams.setPhone(phoneNum);
            Example<MobUserInfo> example = Example.of(findParams);
            List<MobUserInfo> mobUserInfoList = mobUserInfoRepository.findAll(example);

            List list = new ArrayList();
            if (mobUserInfoList.size() > 0) {
                MobUserInfo index0 = mobUserInfoList.get(0);
                String userId = index0.getUserId();
                MobCreditAmount creditfindParams = new MobCreditAmount();
                creditfindParams.setUserId(userId);
                Example<MobCreditAmount> creditExample = Example.of(creditfindParams);
                List<MobCreditAmount> creditAmountList = mobCreditAmountRepository.findAll(creditExample);
                for (int i = 0; i < creditAmountList.size(); i++) {
                    MobUserDto mif = new MobUserDto();
                    mif.setRealname(index0.getRealname());
                    mif.setPhone(index0.getPhone());
                    mif.setUserId(index0.getUserId());
                    mif.setAmountType(convertAmountType(creditAmountList.get(i).getType()));
                    mif.setAmount(creditAmountList.get(i).getAmount());
                    mif.setAdddate(creditAmountList.get(i).getAdddate());
                    list.add(mif);
                }
            }
            dg.setRows(list);
            dg.setTotal(mobUserInfoList.size());
        }
        return dg;
    }

    private String convertAmountType(String type) {
        int typyInt = Integer.parseInt(type);
        String value = "";
        if (typyInt == 1) {
            value = "单期额度";
        } else if (typyInt == 2) {
            value = "分期额度";
        } else if (typyInt == 12) {
            value = "商城额度";
        } else if (typyInt == 1201) {
            value = "海尔额度";
        } else if (typyInt == 1202) {
            value = "雷龙额度";
        } else if (typyInt == 1203) {
            value = "奢分期额度";
        } else if (typyInt == 1204) {
            value = "不知道额度";
        } else if (typyInt == 1205) {
            value = "壹分期额度";
        }
        return value;
    }
}
