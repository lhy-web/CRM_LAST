package com.service;

import com.domain.Missioninfo;
import com.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface MissionInfoService {
    public List<Missioninfo> findAllMission();

    //查询任务名是否重复
    boolean findMissionName(String missionName);
    //添加任务
    void saveMissionInfo(Missioninfo missionInfo);
    //查看任务详细信息
    Missioninfo findMissionInfoDetail(Integer missionInfoId);
    //修改任务信息
    Boolean updateMissionInfo(Missioninfo missionInfo);
    //    删除任务信息
    Boolean deleteMissionInfo(Integer missionInfoId);


    PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
}
