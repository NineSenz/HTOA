package com.ht.dao;

import com.ht.bean.T_department;
import com.ht.util.Pager;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

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

    public T_department save(T_department t_department) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_department);
        session.getTransaction().commit();
        return t_department;
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
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_department where t_dep_id=:p");
        query.setString("p",p);
        T_department t_department = (T_department) query.uniqueResult();
        session.getTransaction().commit();
        return t_department;
    }



    @Override
    public void close() {
        session.close();
    }

    @Override
    public int count() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(T_department.class);
        criteria.setProjection(Projections.rowCount());
        Object object = criteria.uniqueResult();
        session.getTransaction().commit();
        return Integer.valueOf(object.toString());
    }

    @Override
    public Pager<T_department> pagerList(Pager pager) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_department ");
        query.setFirstResult(pager.getBeginIndex());
        query.setMaxResults(pager.getPageSize());
        pager.setRows(query.list());
        pager.setTotal(count());
        return pager;
    }
}

