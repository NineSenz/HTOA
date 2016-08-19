package com.ht.dao;

import com.ht.bean.T_undergo;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_undergoDAOImpl implements T_undergoDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_undergo t_undergo) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_undergo);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_undergo t_undergo) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_undergo);
        session.getTransaction().commit();
    }

    @Override
    public T_undergo update(T_undergo t_undergo) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_undergo);
        session.getTransaction().commit();
        return t_undergo;
    }

    @Override
    public List<T_undergo> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_undergo");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_undergo query(String p) {
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
    public Pager<T_undergo> pagerList(Pager pager) {
        return null;
    }
}
