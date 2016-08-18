package com.ht.dao;

import com.ht.bean.T_income;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_incomeDAOImpl implements T_incomeDAO {

    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_income t_income) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_income);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_income t_income) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_income);
        session.getTransaction().commit();
    }

    @Override
    public T_income update(T_income t_income) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_income);
        session.getTransaction().commit();
        return t_income;
    }

    @Override
    public List<T_income> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_income");
        List<T_income> list = query.list();
        return list;
    }

    @Override
    public T_income query(String p) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_income t where t_inc_id =:id");
        query.setString("id", p);
        T_income t_income = (T_income) query.uniqueResult();
        session.getTransaction().commit();
        return t_income;
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
    public Pager<T_income> pagerList(Pager pager) {
        return null;
    }
}
