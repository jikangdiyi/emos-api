package com.example.emos.api.service;

import com.example.emos.api.common.util.PageUtils;

import java.util.HashMap;

/**
 * @author: jikang
 * @description:
 * @date: 2022/5/4 18:07
 * @Modified By:
 */
public interface MeetingService {
    public boolean searchMeetingMembersInSameDept(String uuid);

    public HashMap searchMeetingById(HashMap param);

    public PageUtils searchOfflineMeetingByPage(HashMap param);

    public long searchOfflineMeetingCount(HashMap param);
}
