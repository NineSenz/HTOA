package com.ht.dao;

import com.ht.bean.T_workcheckunusual;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_workcheckunusualDAOImpl implements T_workcheckunusualDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void save(T_workcheckunusual t_workcheckunusual) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_workcheckunusual);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_workcheckunusual t_workcheckunusual) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_workcheckunusual);
        session.getTransaction().commit();
    }

    @Override
    public T_workcheckunusual update(T_workcheckunusual t_workcheckunusual) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_workcheckunusual);
        session.getTransaction().commit();
        return t_workcheckunusual;
    }

    @Override
    public List<T_workcheckunusual> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_workcheckunusual");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_workcheckunusual query(String p) {
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
    public Pager<T_workcheckunusual> pagerList(Pager pager) {
        return null;
    }
}
