package com.ht.dao;

import com.ht.bean.T_workcheck;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_workcheckDAOImpl implements T_workcheckDAO{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public T_workcheck save(T_workcheck t_workcheck) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_workcheck);
        session.getTransaction().commit();
        return t_workcheck;
    }

    @Override
    public void delete(T_workcheck t_workcheck) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_workcheck);
        session.getTransaction().commit();
    }

    @Override
    public T_workcheck update(T_workcheck t_workcheck) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_workcheck);
        session.getTransaction().commit();
        return t_workcheck;
    }

    @Override
    public List<T_workcheck> queryAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_workcheck ");
        List<T_workcheck> list = query.list();
        session.getTransaction().commit();
        return list;
    }

    @Override
    public T_workcheck query(String p) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_workcheck> pagerList(Pager pager) {
        return null;
    }
}
