package com.domain;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Missioninfo implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "missionId")
    private Integer missionId;//任务ID
    private String  missionSubject;//任务主题
    private String  missionName;//客户名称
    private String  missionLinkman;//联系人
    private String completeTime;//完成期限
    private String precedence;//优先级
    private String administer;//执行人
    private String missionDescription;//任务描述
    public Missioninfo(){}
    public Missioninfo(Integer missionId, String missionSubject, String missionName, String missionLinkman, String completeTime, String precedence, String administer, String missionDescription) {
        this.missionId = missionId;
        this.missionSubject = missionSubject;
        this.missionName = missionName;
        this.missionLinkman = missionLinkman;
        this.completeTime = completeTime;
        this.precedence = precedence;
        this.administer = administer;
        this.missionDescription = missionDescription;
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
}
