package com.action;

import com.domain.Missioninfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;

/*
* 查看任务详细信息的Action
* */
public class ViewDetailsMissionAction extends ActionSupport {
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
       Missioninfo missioninfo = service.findMissionInfoDetail(MissionInfoId);
        ActionContext.getContext().put("missionInfo", missioninfo);
        return "viewDetailsMission";
    }
}
