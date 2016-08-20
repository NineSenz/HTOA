package com.ht.dao;

import com.ht.bean.T_wages;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_wagesDAOImpl implements T_wagesDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public T_wages save(T_wages t_wages) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_wages);
        session.getTransaction().commit();
        return t_wages;
    }

    @Override
    public void delete(T_wages t_wages) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_wages);
        session.getTransaction().commit();
    }

    @Override
    public T_wages update(T_wages t_wages) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_wages);
        session.getTransaction().commit();
        return t_wages;
    }

    @Override
    public List<T_wages> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_wages");
        List<T_wages> list = query.list();
        return list;
    }

    @Override
    public T_wages query(String p) {
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
    public Pager<T_wages> pagerList(Pager pager) {
        return null;
    }
}
