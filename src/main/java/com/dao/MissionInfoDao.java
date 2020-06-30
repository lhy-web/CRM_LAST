package com.dao;

import com.domain.Missioninfo;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface MissionInfoDao {
    //查询全部
    List<Missioninfo> findAllMission();
    //添加客户信息
    Boolean add(Missioninfo missioninfo);
//    //获取客户等级
//    List<MissionLevel> getMissionLevel();
//    //获取客户性质
//    List<DictionaryTypeInfo> getMissionProperties();
//    //获取客户类型
//    List<DictionaryTypeInfo> getMissionType();
//    //获取开户银行
//    List<DictionaryTypeInfo> getMissionOpenBank();
//    //获取客户来源
//    List<DictionaryTypeInfo> getMissionSource();
    //查看任务名是否重复
    boolean getChongfu(String missionSubject);
    //查看客户详细信息
    Missioninfo findById(Integer missionInfoId);
    //修改客户信息
    Boolean updateMission(Missioninfo missionInfo);
//删除客户信息
    Boolean deleteMission(Integer missionInfoId);


    Integer getTotalCount(DetachedCriteria dc);

    List<Missioninfo> getList(DetachedCriteria dc, Integer first, Integer pageSize);
}