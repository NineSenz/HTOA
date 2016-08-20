package com.ht.dao;

import com.ht.bean.T_admin;
import com.ht.bean.T_staff;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/12.
 */
public class T_staffDAOImpl implements T_staffDAO{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T_staff save(T_staff t_staff) {
        Session sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        sion.save(t_staff);
        sion.getTransaction().commit();
        return t_staff;
    }

    @Override
    public void delete(T_staff t_staff) {
        Session sion = sessionFactory.getCurrentSession();
        sion.beginTransaction();
        sion.delete(t_staff);
        sion.getTransaction().commit();
    }

    @Override
    public T_staff update(T_staff t_staff) {
        System.out.println("update");
        System.out.println(t_staff.getT_sta_name());
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_staff);
        session.getTransaction().commit();
        return t_staff;
    }

    @Override
    public List<T_staff> queryAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from T_staff");
        List<T_staff> list= query.list();
        return list;
    }

    @Override
    public T_staff query(String p) {
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
    public Pager<T_staff> pagerList(Pager pager) {
        return null;
    }
}
