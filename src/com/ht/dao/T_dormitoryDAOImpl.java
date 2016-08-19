package com.ht.dao;

import com.ht.bean.T_dormitory;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_dormitoryDAOImpl implements T_dormitoryDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_dormitory t_dormitory) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_dormitory);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_dormitory t_dormitory) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_dormitory);
        session.delete(t_dormitory);
        session.getTransaction().commit();
    }

    @Override
    public T_dormitory update(T_dormitory t_dormitory) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_dormitory);
        session.getTransaction().commit();
        return t_dormitory;
    }

    @Override
    public List<T_dormitory> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_dormitory");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_dormitory query(String p) {
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
    public Pager<T_dormitory> pagerList(Pager pager) {
        return null;
    }
}
