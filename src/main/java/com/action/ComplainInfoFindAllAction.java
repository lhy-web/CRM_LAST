package com.action;

import javax.servlet.http.HttpServletRequest;

import com.page.Page;
import com.page.Result;
import com.service.ComplainInfoService;
import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;

public class ComplainInfoFindAllAction extends ActionSupport{


	private ComplainInfoService complainInfoService;
	private Integer currentPage;

	public ComplainInfoService getComplainInfoService() {
		return complainInfoService;
	}
	public void setComplainInfoService(ComplainInfoService complainInfoService) {
		this.complainInfoService = complainInfoService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	@Override
	public String execute() throws Exception {
		Page page = new Page();
		page.setEveryPage(10);
		if(currentPage==null ||currentPage==0){
		   currentPage=1;
		}
		page.setCurrentPage(currentPage);

		Result result=complainInfoService.findAllComplainInfo(page);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("findAllComplainInfo", result.getList());
		request.setAttribute("page", result.getPage());


		return this.SUCCESS;
	}


}
