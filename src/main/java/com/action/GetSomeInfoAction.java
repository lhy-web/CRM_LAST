package com.action;

import com.service.MissionInfoService;
import com.service.MissionInfoServiceImpl;

public class GetSomeInfoAction {
    private MissionInfoService service;


    public void setService(MissionInfoService service) {
        this.service = service;
    }
    public String getDirctionaryMission() throws Exception {return "getDirctionaryMission";}
}
