package com.ht.dao;

import com.ht.bean.T_inquire;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_inquireDAOImpl implements T_inquireDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void save(T_inquire t_inquire) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_inquire);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_inquire t_inquire) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_inquire);
        session.getTransaction().commit();
    }

    @Override
    public T_inquire update(T_inquire t_inquire) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_inquire);
        session.getTransaction().commit();
        return t_inquire;
    }

    @Override
    public List<T_inquire> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_inquire");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_inquire query(String p) {
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
    public Pager4EasyUI<T_inquire> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
