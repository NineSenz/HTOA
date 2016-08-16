package com.ht.dao;

import com.ht.bean.T_course;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_courseDAOImpl implements T_courseDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_course t_course) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_course);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_course t_course) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_course);
        session.getTransaction().commit();
    }

    @Override
    public T_course update(T_course t_course) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_course);
        session.getTransaction().commit();
        return t_course;
    }

    @Override
    public List<T_course> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_course");
        List<T_course> list = query.list();
        return list;
    }

    @Override
    public T_course query(String p) {
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
    public Pager4EasyUI<T_course> Pagelist(Pager4EasyUI pager) {
        return null;
    }
}
