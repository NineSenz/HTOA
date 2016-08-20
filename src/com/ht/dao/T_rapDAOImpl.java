package com.ht.dao;

import com.ht.bean.T_rap;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_rapDAOImpl implements T_rapDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T_rap save(T_rap t_rap) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_rap);
        session.getTransaction().commit();
        return t_rap;
    }

    @Override
    public void delete(T_rap t_rap) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_rap);
        session.getTransaction().commit();
    }

    @Override
    public T_rap update(T_rap t_rap) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_rap);
        session.getTransaction().commit();
        return t_rap;
    }

    @Override
    public List<T_rap> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_rap ");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_rap query(String p) {
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
    public Pager<T_rap> pagerList(Pager pager) {
        return null;
    }
}
