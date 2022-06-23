package com.example.emos.api.service.impl;

import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;
import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.dao.TbMeetingDao;
import com.example.emos.api.service.MeetingService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: jikang
 * @description:
 * @date: 2022/5/4 18:10
 * @Modified By:
 */
@Service
@Slf4j
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    private TbMeetingDao meetingDao;

    @Override
    public boolean searchMeetingMembersInSameDept(String uuid) {
        return false;
    }

    @Override
    public HashMap searchMeetingById(HashMap param) {

        return null;
    }

    @Override
    public PageUtils searchOfflineMeetingByPage(HashMap param) {
        ArrayList<HashMap> list = meetingDao.searchOfflineMeetingByPage(param);
        long count = meetingDao.searchOfflineMeetingCount(param);
        int start = (Integer)param.get("start");//或者 int start = MapUtil.getInt(param,"start");
        int length = MapUtil.getInt(param,"length");
        for(HashMap map : list){
            String meeting = (String)map.get("meeting");
            if(StringUtils.isNotBlank(meeting)){
                map.replace("meeting", JSONUtil.parseArray(meeting));
            }
        }
        PageUtils page = new PageUtils(list,count,start,length);
        return page;
    }

    @Override
    public long searchOfflineMeetingCount(HashMap param) {
        return 0;
    }
}
