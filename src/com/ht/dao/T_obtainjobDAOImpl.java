package com.ht.dao;

import com.ht.bean.T_admin;
import com.ht.bean.T_obtainjob;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_obtainjobDAOImpl implements T_obtainjobDAO {
    private SessionFactory sessionFactory;
    private Session session;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_obtainjob t_obtainjob) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_obtainjob);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_obtainjob t_obtainjob) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_obtainjob);
        session.getTransaction().commit();
    }

    @Override
    public T_obtainjob update(T_obtainjob t_obtainjob) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_obtainjob);
        session.getTransaction().commit();
        return t_obtainjob;
    }

    @Override
    public T_obtainjob query(String p) {
        return null;
    }

    @Override
    public List<T_obtainjob> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_obtainjob");
        List<T_obtainjob> list = query.list();
        return list;
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager4EasyUI<T_obtainjob> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
