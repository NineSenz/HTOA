package com.ht.dao;

import com.ht.bean.T_journal;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_journalDAOImpl implements T_journalDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public T_journal save(T_journal t_journal) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_journal);
        session.getTransaction().commit();
        return t_journal;
    }

    @Override
    public void delete(T_journal t_journal) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_journal);
        session.getTransaction().commit();
    }

    @Override
    public T_journal update(T_journal t_journal) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_journal);
        session.getTransaction().commit();
        return t_journal;
    }

    @Override
    public List<T_journal> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_journal");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_journal query(String p) {
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
    public Pager<T_journal> pagerList(Pager pager) {
        return null;
    }
}
