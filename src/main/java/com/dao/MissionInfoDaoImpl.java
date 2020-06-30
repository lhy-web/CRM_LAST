package com.dao;

import com.domain.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class MissionInfoDaoImpl extends HibernateDaoSupport implements MissionInfoDao {
    public List<Missioninfo> findAllMission() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from Missioninfo";
        Query query=session.createQuery(hql);
        List<Missioninfo> list=query.list();//返回lis结果集
        return list;

    }

    public Boolean add(Missioninfo missioninfo) {
        try {
            getHibernateTemplate().save(missioninfo);
            return true;
        }catch (Exception e){
            return false;
        }
    }

//    public List<MissionLevel> getMissionLevel() {
//        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
//        String hql="from MissionLevel";
//        Query query = session.createQuery(hql);
//        List<MissionLevel> list = query.list();
//        return list;
//    }
//
//    public List<DictionaryTypeInfo> getMissionProperties() {
//        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
//        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(2,"企业性质-分类")));
//        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
//
//        return list;
//    }
//
//    public List<DictionaryTypeInfo> getMissionType() {
//        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
//        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(1,"企业类型-分类")));
//        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
//
//        return list;
//    }
//
//    public List<DictionaryTypeInfo> getMissionOpenBank() {
//        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
//        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(3,"开户银行-分类")));
//        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
//
//        return list;
//    }
//
//    public List<DictionaryTypeInfo> getMissionSource() {
//        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
//        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(4,"信息来源-分类")));
//        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
//
//        return list;
//    }

    public boolean getChongfu(String missionName) {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Missioninfo.class);
        detachedCriteria.add(Restrictions.eq("missionName",missionName));
        List<Missioninfo> list = (List<Missioninfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
        if(list.isEmpty()==true){
            return false;
        }else
            return true;
    }

    public Missioninfo findById(Integer missionInfoId) {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Missioninfo.class);
        detachedCriteria.add(Restrictions.eq("missionId",missionInfoId));
        List<Missioninfo> list = (List<Missioninfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
     if(list.size()!=0){
        Missioninfo c=list.get(0);
        return c;}
     else return null;

    }

    public Boolean updateMission(Missioninfo missionInfo) {
        try {


        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        Missioninfo c = session.get(Missioninfo.class, missionInfo.getMissionId());
        c.setMissionSubject(missionInfo.getMissionSubject());
        c.setMissionName(missionInfo.getMissionName());
        c.setMissionLinkman(missionInfo.getMissionLinkman());
        c.setCompleteTime(missionInfo.getCompleteTime());
        c.setPrecedence(missionInfo.getPrecedence());
        c.setAdminister(missionInfo.getAdminister());
        c.setMissionDescription(missionInfo.getMissionDescription());
        
        session.update(c);
        return true;}catch (Exception e){
            System.out.println(e);
            return false;
        }



    }

    public Boolean deleteMission(Integer missionInfoId) {
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            Missioninfo missioninfo = session.get(Missioninfo.class, missionInfoId);
            session.delete(missioninfo);
            return true;
        }catch (Exception e){
            return false;
        }
    }


//条件分页获取总条数
    public Integer getTotalCount(DetachedCriteria dc) {
        dc.setProjection(Projections.rowCount());
        List list= getHibernateTemplate().findByCriteria(dc);
        dc.setProjection(null);
        if(list!=null&&list.size()>0){
            Long a= (Long) list.get(0);
            return  a.intValue();
        }else
            return 0;
    }

    public List<Missioninfo> getList(DetachedCriteria dc, Integer first, Integer pageSize) {
        return (List<Missioninfo>) getHibernateTemplate().findByCriteria(dc,first, pageSize);
    }
}
