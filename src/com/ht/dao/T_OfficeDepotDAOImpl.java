package com.ht.dao;

import com.ht.bean.T_OfficeDepot;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/13.
 */
public class T_OfficeDepotDAOImpl implements T_OfficeDepotDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public T_OfficeDepot save(T_OfficeDepot t_officeDepot) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_officeDepot);
        session.getTransaction().commit();
        return t_officeDepot;
    }

    @Override
    public void delete(T_OfficeDepot t_officeDepot) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_officeDepot);
        session.getTransaction().commit();
    }

    @Override
    public T_OfficeDepot update(T_OfficeDepot t_officeDepot) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_officeDepot);
        session.getTransaction().commit();
        return t_officeDepot;
    }

    @Override
    public List<T_OfficeDepot> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_OfficeDepot");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_OfficeDepot query(String p) {
        return null;
    }

    @Override
    public void close() {
        session.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_OfficeDepot> pagerList(Pager pager) {
        return null;
    }
}
