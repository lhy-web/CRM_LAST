package com.service;

import com.dao.MissionInfoDao;

import com.domain.Missioninfo;
import com.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class MissionInfoServiceImpl implements MissionInfoService {
    private MissionInfoDao dao;

    public void setDao(MissionInfoDao dao) {
        this.dao = dao;
    }
    @Transactional
    public List<Missioninfo> findAllMission() {
        List<Missioninfo> list = dao.findAllMission();
        System.out.println(list);
        return list;
    }

    @Transactional
    public boolean findMissionName(String missionSubject) {
        return dao.getChongfu(missionSubject);

    }
    @Transactional
    public void saveMissionInfo(Missioninfo missionInfo) {
        Boolean a = dao.add(missionInfo);
        if(a==true){
            System.out.println("添加成功");
        }else
            System.out.println("添加失败");
    }
    @Transactional
    public Missioninfo findMissionInfoDetail(Integer missionInfoId) {
       return dao.findById(missionInfoId);
    }
    @Transactional
    public Boolean updateMissionInfo(Missioninfo missionInfo) {
        return dao.updateMission(missionInfo);
    }
    @Transactional
    public Boolean deleteMissionInfo(Integer missionInfoId) {
       return dao.deleteMission(missionInfoId);
    }

    @Transactional
    public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
        //根据查询条件获取总记录数
        Integer totalCount=dao.getTotalCount(dc);
        //创建pageBean对象
        PageBean pageBean=new PageBean(currentPage,totalCount,pageSize);
        //获取每页列表
        List<Missioninfo> list=dao.getList(dc,pageBean.getFirst(),pageBean.getPageSize());
        pageBean.setList(list);


        return pageBean;
    }

}
