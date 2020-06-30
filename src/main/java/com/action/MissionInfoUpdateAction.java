package com.action;

import com.domain.Missioninfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;

import java.util.List;

/*
* 修改任务信息(回显)
* */
public class MissionInfoUpdateAction extends ActionSupport {
    private Integer MissionInfoId;
    private MissionInfoService service;

    public Integer getMissionInfoId() {
        return MissionInfoId;
    }

    public void setMissionInfoId(Integer missionInfoId) {
        MissionInfoId = missionInfoId;
    }

    public MissionInfoService getService() {
        return service;
    }

    public void setService(MissionInfoService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        Missioninfo missionInfoDetail = service.findMissionInfoDetail(MissionInfoId);
        ActionContext.getContext().put("missionInfo",missionInfoDetail);
        return "updateInfo";
    }
}
