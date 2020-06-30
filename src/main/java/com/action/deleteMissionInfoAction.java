package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;

/*
* 删除任务信息的Action
* */
public class deleteMissionInfoAction extends ActionSupport {
        private Integer MissionInfoId;
        private MissionInfoService service;

    public Integer getMissionInfoId() {
        return MissionInfoId;
    }

    public void setMissionInfoId(Integer customerInfoId) {
        MissionInfoId = customerInfoId;
    }

    public MissionInfoService getService() {
        return service;
    }

    public void setService(MissionInfoService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        Boolean b=service.deleteMissionInfo(MissionInfoId);
        if(b==true){
            return "deleteMission";
        }else
            return "false";
    }
}
