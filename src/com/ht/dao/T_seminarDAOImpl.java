package com.ht.dao;

import com.ht.bean.T_seminar;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_seminarDAOImpl implements T_seminarDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_seminar t_seminar) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_seminar);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_seminar t_seminar) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_seminar);
        session.getTransaction().commit();
    }

    @Override
    public T_seminar update(T_seminar t_seminar) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_seminar);
        session.getTransaction().commit();
        return t_seminar;
    }

    @Override
    public List<T_seminar> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_seminar");
        List<T_seminar> list = query.list();
        return list;
    }

    @Override
    public T_seminar query(String p) {
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
    public Pager4EasyUI<T_seminar> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
