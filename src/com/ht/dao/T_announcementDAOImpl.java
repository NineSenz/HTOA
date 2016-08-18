package com.ht.dao;

import com.ht.bean.T_announcement;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_announcementDAOImpl implements T_announcementDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_announcement t_announcement) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_announcement);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_announcement t_announcement) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_announcement);
        session.getTransaction().commit();
    }

    @Override
    public T_announcement update(T_announcement t_announcement) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_announcement);
        session.getTransaction().commit();
        return t_announcement;
    }

    @Override
    public List<T_announcement> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_announcement");
        List<T_announcement> list = query.list();
        return list;
    }

    @Override
    public T_announcement query(String p) {
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
    public Pager<T_announcement> pagerList(Pager pager) {
        return null;
    }
}
