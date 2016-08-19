package com.ht.dao;

import com.ht.bean.T_tickling;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_ticklingDAOImpl implements T_ticklingDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_tickling t_tickling) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_tickling);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_tickling t_tickling) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_tickling);
        session.getTransaction().commit();
    }

    @Override
    public T_tickling update(T_tickling t_tickling) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_tickling);
        session.getTransaction().commit();
        return t_tickling;
    }

    @Override
    public List<T_tickling> queryAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_tickling");
        List<T_tickling> list = query.list();
        session.getTransaction().commit();
        return list;
    }

    @Override
    public T_tickling query(String p) {
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
    public Pager<T_tickling> pagerList(Pager pager) {
        return null;
    }
}
