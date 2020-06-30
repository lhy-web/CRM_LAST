package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.domain.RoleInfo;
import com.domain.RoleRelationship;
import com.service.RoleInfoService;
import com.service.RoleRelationshipService;
import com.opensymphony.xwork2.ActionSupport;

public class RoleInfoDetailAction extends ActionSupport{
	//private static final long serialVersionUID = 7141903029922534430L;
	private RoleInfoService roleInfoService;
	private RoleRelationshipService roleRelationshipService;
	private Integer roleId;
	
	public RoleInfoService getRoleInfoService() {
		return roleInfoService;
	}

	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}

	public RoleRelationshipService getRoleRelationshipService() {
		return roleRelationshipService;
	}

	public void setRoleRelationshipService(
			RoleRelationshipService roleRelationshipService) {
		this.roleRelationshipService = roleRelationshipService;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String execute() throws Exception {
		RoleInfo roleInfo = roleInfoService.findByRoleInfoId(roleId);

		List<RoleRelationship> roleInfoLimits=roleRelationshipService.findByRoleRelationship(roleInfo);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("roleInfo", roleInfo);
		request.setAttribute("roleInfoLimits", roleInfoLimits);
		return this.SUCCESS;
	}

}
