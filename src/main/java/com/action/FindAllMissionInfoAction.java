package com.action;

import com.domain.Missioninfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MissionInfoService;
import com.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/*
* 查询全部信息的Action
* */
public class FindAllMissionInfoAction extends ActionSupport {
    private MissionInfoService service;
    private String type;
    private Integer currentPage;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private Integer pageSize;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MissionInfoService getService() {
        return service;
    }

    public void setService(MissionInfoService service) {
        this.service = service;
    }


    public String findAllMission() throws Exception {
        //离线查询对象
        DetachedCriteria dc=DetachedCriteria.forClass(Missioninfo.class);
        //前台传入的条件不为空时封装查询对象

        if(key!=null) {
            if (type.equals("missionSubject")) {
                dc.add(Restrictions.like("missionSubject","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }
            if (type.equals("missionName")) {
                dc.add(Restrictions.like("missionName","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }
            if (type.equals("missionLinkman")) {
                dc.add(Restrictions.like("missionLinkman","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }if (type.equals("completeTime")) {
                dc.add(Restrictions.like("completeTime","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }
            if (type.equals("precedence")) {
                dc.add(Restrictions.like("precedence","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }
            if (type.equals("administer")) {
                dc.add(Restrictions.like("administer","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }
            if (type.equals("missionDescription")) {
                dc.add(Restrictions.like("missionDescription","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAllMission";

            }

        }else {
            PageBean pb=service.getPageBean(dc,currentPage,pageSize);
            ActionContext.getContext().put("list",pb);}

             return "findAllMission";

    }
}
