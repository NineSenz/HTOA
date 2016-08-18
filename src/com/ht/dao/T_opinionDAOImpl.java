package com.ht.dao;

import com.ht.bean.T_opinion;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_opinionDAOImpl implements T_opinionDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_opinion t_opinion) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_opinion);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_opinion t_opinion) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_opinion);
        session.getTransaction().commit();
    }

    @Override
    public T_opinion update(T_opinion t_opinion) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_opinion);
        session.getTransaction().commit();
        return t_opinion;
    }

    @Override
    public List<T_opinion> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_opinion");
        List<T_opinion> list = query.list();
        return list;
    }

    @Override
    public T_opinion query(String p) {
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
    public Pager<T_opinion> pagerList(Pager pager) {
        return null;
    }
}
