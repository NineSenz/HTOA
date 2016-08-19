package com.ht.dao;

import com.ht.bean.T_beonduty;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_beondutyDAOImpl implements T_beondutyDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_beonduty t_beonduty) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_beonduty);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_beonduty t_beonduty) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_beonduty);
        session.getTransaction().commit();
    }

    @Override
    public T_beonduty update(T_beonduty t_beonduty) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_beonduty);
        session.getTransaction().commit();
        return t_beonduty;
    }

    @Override
    public List<T_beonduty> queryAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_beonduty");
        List<T_beonduty> list = query.list();
        return list;
    }

    @Override
    public T_beonduty query(String p) {
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
    public Pager<T_beonduty> pagerList(Pager pager) {
        return null;
    }
}
