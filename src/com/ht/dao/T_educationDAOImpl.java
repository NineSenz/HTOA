package com.ht.dao;

import com.ht.bean.T_education;
import com.ht.util.Pager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_educationDAOImpl implements T_educationDAO{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_education t_education) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_education);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_education t_education) {

    }

    @Override
    public T_education update(T_education t_education) {
        return null;
    }

    @Override
    public List<T_education> queryAll() {
        return null;
    }

    @Override
    public T_education query(String p) {
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
    public Pager<T_education> pagerList(Pager pager) {
        return null;
    }
}
