package com.ht.dao;

import com.ht.bean.T_schedule;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_scheduleDAOImpl implements T_scheduleDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_schedule t_schedule) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_schedule);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_schedule t_schedule) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_schedule);
        session.getTransaction().commit();
    }

    @Override
    public T_schedule update(T_schedule t_schedule) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_schedule);
        session.getTransaction().commit();
        return t_schedule;
    }

    @Override
    public List<T_schedule> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_schedule");
        List<T_schedule> list = query.list();
        return list;
    }

    @Override
    public T_schedule query(String p) {
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
    public Pager4EasyUI<T_schedule> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
