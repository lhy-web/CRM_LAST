package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;

import java.util.List;

/*
* 批量删除客户信息*/
public class ManyDeleteMissionAction extends ActionSupport {
        private List<Integer> checkboxDelete;
        private MissionInfoService service;

    public void setService(MissionInfoService service) {
        this.service = service;
    }

    public List<Integer> getCheckboxDelete() {
        return checkboxDelete;
    }

    public void setCheckboxDelete(List<Integer> checkboxDelete) {
        this.checkboxDelete = checkboxDelete;
    }

    @Override
    public String execute() throws Exception {
        for (Integer integer : checkboxDelete) {
            service.deleteMissionInfo(integer);
        }
        return "manyDeleteMission";
    }
}
