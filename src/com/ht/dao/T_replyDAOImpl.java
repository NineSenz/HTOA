package com.ht.dao;

import com.ht.bean.T_reply;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_replyDAOImpl implements T_replyDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void save(T_reply t_reply) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_reply);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_reply t_reply) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_reply);
        session.getTransaction().commit();
    }

    @Override
    public T_reply update(T_reply t_reply) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_reply);
        session.getTransaction().commit();
        return null;
    }

    @Override
    public List<T_reply> queryAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_reply");
        List<T_reply> list = query.list();
        return list;
    }

    @Override
    public T_reply query(String p) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_reply where t_rep_id=:id");
        query.setString("id",p);
        T_reply t_reply = (T_reply) query.uniqueResult();
        session.getTransaction().commit();
        return t_reply;
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
    public Pager<T_reply> pagerList(Pager pager) {
        return null;
    }
}
