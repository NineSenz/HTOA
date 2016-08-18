package com.ht.dao;

import com.ht.bean.T_department;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public class T_departmentDAOImpl implements T_departmentDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void save(T_department t_department) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_department);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_department t_department) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_department);
        session.getTransaction().commit();
    }

    @Override
    public T_department update(T_department t_department) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_department);
        session.getTransaction().commit();
        return t_department;
    }

    @Override
    public List<T_department> queryAll() {
        session=sessionFactory.openSession();
        Query que=session.createQuery("from T_department");
        List<T_department> list=que.list();
        session.close();
        return list;
    }

    @Override
    public T_department query(String p) {
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
    public Pager<T_department> pagerList(Pager pager) {
        return null;
    }
}

