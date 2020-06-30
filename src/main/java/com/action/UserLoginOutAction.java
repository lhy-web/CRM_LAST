package com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLoginOutAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        HttpSession session =  ServletActionContext.getRequest().getSession();
        if(session==null){
            return SUCCESS;
        }
        session.removeAttribute("roleRelationship");
        return SUCCESS;
    }
}
