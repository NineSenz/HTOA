package com.ht.dao;

import com.ht.bean.TTest;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by GMB on 2016/8/11.
 */
public class TestDAOImpl implements TestDAO {
    private SessionFactory sessionFactory;
    private Session sion;
    public void setSfy(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public TTest save(TTest test) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        //System.out.println(test);
        sion.save(test);
        sion.getTransaction().commit();
        return test;
    }

    @Override
    public void delete(TTest test) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        //System.out.println(test);
        sion.delete(test);
        sion.getTransaction().commit();
    }

    @Override
    public TTest update(TTest test) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        //System.out.println(test);
        sion.update(test);
        sion.getTransaction().commit();
        return test;
    }

    @Override
    public List<TTest> queryAll() {
        return null;
    }

    @Override
    public TTest query(String id) {
        System.out.println(id);
        sion = sessionFactory.openSession();
        Object obj = sion.get(TTest.class,id);
        return obj==null?null:(TTest)obj;
    }

    @Override
    public void close() {
        sion.close();
    }

    @Override
    public int count() {
        sion = sessionFactory.openSession();
        int count=Integer.parseInt(sion.createQuery("select count(*) from TTest").uniqueResult().toString());
        return count;
    }

    @Override
    public Pager<TTest> pagerList(Pager pager) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        Query query = sion.createQuery("from TTest");
        query.setFirstResult(pager.getBeginIndex());
        query.setMaxResults(pager.getPageSize());
        pager.setRows(query.list());
        sion.getTransaction().commit();
        return pager;
    }
}
