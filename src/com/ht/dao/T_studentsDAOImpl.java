package com.ht.dao;

import com.ht.bean.T_students;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_studentsDAOImpl implements T_studentsDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_students t_students) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_students);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_students t_students) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_students);
        session.getTransaction().commit();
    }

    @Override
    public T_students update(T_students t_students) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_students);
        session.getTransaction().commit();
        return t_students;
    }

    @Override
    public List<T_students> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_students ");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_students query(String p) {
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
    public Pager4EasyUI<T_students> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
