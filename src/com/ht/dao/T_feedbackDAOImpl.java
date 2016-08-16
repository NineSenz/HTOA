package com.ht.dao;


import com.ht.bean.T_feedback;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_feedbackDAOImpl implements T_feedbackDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_feedback t_feedback) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_feedback);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_feedback t_feedback) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_feedback);
        session.getTransaction().commit();
    }

    @Override
    public T_feedback update(T_feedback t_feedback) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_feedback);
        session.getTransaction().commit();
        return t_feedback;
    }

    @Override
    public List<T_feedback> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_feedback");
        List<T_feedback> list = query.list();
        return list;
    }

    @Override
    public T_feedback query(String p) {
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
    public Pager4EasyUI<T_feedback> Pagelist(Pager4EasyUI pager) {
        return null;
    }
}
