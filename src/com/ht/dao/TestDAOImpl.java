package com.ht.dao;

import com.ht.bean.TTest;
import com.ht.util.Pager;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

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
        sion.save(test);
        sion.getTransaction().commit();
        return test;
    }

    @Override
    public void delete(TTest test) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        sion.delete(test);
        sion.getTransaction().commit();
    }

    @Override
    public TTest update(TTest test) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        TTest T =(TTest) sion.get(TTest.class, test.getId());
        T.setName(test.getName());
        T.setMoney(test.getMoney());
        T.setBirth(test.getBirth());
        sion.update(T);
        sion.getTransaction().commit();
        return test==null?null:test;
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
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        Criteria criteria = sion.createCriteria(TTest.class);
        criteria.setProjection(Projections.rowCount());
        Object object = criteria.uniqueResult();
        sion.getTransaction().commit();
        return Integer.valueOf(object.toString());
    }

    @Override
    public Pager<TTest> pagerList(Pager pager) {
        sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        Query query = sion.createQuery("from TTest");
        query.setFirstResult(pager.getBeginIndex());
        query.setMaxResults(pager.getPageSize());
        Criteria criteria = sion.createCriteria(TTest.class);
        criteria.setProjection(Projections.rowCount());
        Object object = criteria.uniqueResult();
        System.out.println(object);
        pager.setTotal(Integer.parseInt(object.toString()));
        pager.setRows(query.list());
        sion.getTransaction().commit();
        return pager;
    }
}
