package com.ht.dao;

import com.ht.bean.T_expend;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_expendDAOImpl implements T_expendDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_expend t_expend) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_expend);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_expend t_expend) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_expend);
        session.getTransaction().commit();
    }

    @Override
    public T_expend update(T_expend t_expend) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_expend);
        session.getTransaction().commit();
        return t_expend;
    }

    @Override
    public List<T_expend> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_expend");
        List<T_expend> list = query.list();
        return list;
    }

    @Override
    public T_expend query(String p) {
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
    public Pager4EasyUI<T_expend> Pagelist(Pager4EasyUI pager) {
        return null;
    }
}
