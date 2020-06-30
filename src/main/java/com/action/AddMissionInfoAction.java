package com.action;


import com.domain.Missioninfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;
//*
// 增加任务信息的Action
// */
public class AddMissionInfoAction extends ActionSupport {
    private String missionSubject;
    private Integer missionId;
    private String missionLinkman;
    private String precedence;
    private String administer;
    private String missionName;
    private String missionDescription;
    private String completeTime;
    private MissionInfoService service;
    @Override
    public String execute() throws Exception {
        Missioninfo missionInfo = new Missioninfo();
        missionInfo.setMissionSubject(missionSubject);
        missionInfo.setMissionName(missionName);
        missionInfo.setMissionLinkman(missionLinkman);
        missionInfo.setCompleteTime(completeTime);
        missionInfo.setPrecedence(precedence);
        missionInfo.setAdminister(administer);
        missionInfo.setMissionDescription(missionDescription);
        if (service.findMissionName(missionSubject) == false) {
            service.saveMissionInfo(missionInfo);
        } else {
            ActionContext.getContext().put("error", "该公司已经存在");
        }
        return "addMissionInfo";
    }

    public String getMissionSubject() {
        return missionSubject;
    }

    public void setMissionSubject(String missionSubject) {
        this.missionSubject = missionSubject;
    }

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public String getMissionLinkman() {
        return missionLinkman;
    }

    public void setMissionLinkman(String missionLinkman) {
        this.missionLinkman = missionLinkman;
    }

    public String getPrecedence() {
        return precedence;
    }

    public void setPrecedence(String precedence) {
        this.precedence = precedence;
    }

    public String getAdminister() {
        return administer;
    }

    public void setAdminister(String administer) {
        this.administer = administer;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionDescription() {
        return missionDescription;
    }

    public void setMissionDescription(String missionDescription) {
        this.missionDescription = missionDescription;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public MissionInfoService getService() {
        return service;
    }

    public void setService(MissionInfoService service) {
        this.service = service;
    }
}
