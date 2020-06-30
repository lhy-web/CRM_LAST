package com.action;

import com.domain.Missioninfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;

/*修改任务信息*/
public class updateMissionAction extends ActionSupport {

    private Integer missionId;//任务ID
    private String  missionSubject;//任务主题
    private String  missionName;//客户名称
    private String  missionLinkman;//联系人
    private String completeTime;//完成期限
    private String precedence;//优先级
    private String administer;//执行人
    private String missionDescription;//任务描述
    private MissionInfoService service;

    @Override
    public String execute() throws Exception {
        Missioninfo missionInfo = new Missioninfo();
        missionInfo.setMissionId(missionId);
        missionInfo.setMissionSubject(missionSubject);
        missionInfo.setMissionName(missionName);
        missionInfo.setMissionLinkman(missionLinkman);
        missionInfo.setCompleteTime(completeTime);
        missionInfo.setPrecedence(precedence);
        missionInfo.setAdminister(administer);
        missionInfo.setMissionDescription(missionDescription);
        Boolean b=service.updateMissionInfo(missionInfo);
        if (b==true) {
            return "updateMission";
        }
        else return "false";
    }

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public String getMissionSubject() {
        return missionSubject;
    }

    public void setMissionSubject(String missionSubject) {
        this.missionSubject = missionSubject;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionLinkman() {
        return missionLinkman;
    }

    public void setMissionLinkman(String missionLinkman) {
        this.missionLinkman = missionLinkman;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
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

    public String getMissionDescription() {
        return missionDescription;
    }

    public void setMissionDescription(String missionDescription) {
        this.missionDescription = missionDescription;
    }

    public MissionInfoService getService() {
        return service;
    }

    public void setService(MissionInfoService service) {
        this.service = service;
    }
}
