package com.ht.dao;

import com.ht.bean.T_class;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_classDAOImpl implements T_classDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public T_class save(T_class t_class) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_class);
        session.getTransaction().commit();
        return t_class;
    }

    @Override
    public void delete(T_class t_class) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_class);
        session.getTransaction().commit();
    }

    @Override
    public T_class update(T_class t_class) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_class);
        session.getTransaction().commit();
        return t_class;
    }

    @Override
    public List<T_class> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_class ");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_class query(String p) {
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
    public Pager<T_class> pagerList(Pager pager) {
        return null;
    }
}
