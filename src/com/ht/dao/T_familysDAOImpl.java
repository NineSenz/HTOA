package com.ht.dao;

import com.ht.bean.T_familys;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_familysDAOImpl implements T_familysDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_familys t_familys) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_familys);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_familys t_familys) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_familys);
        session.getTransaction().commit();
    }

    @Override
    public T_familys update(T_familys t_familys) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_familys);
        session.getTransaction().commit();
        return t_familys;
    }

    @Override
    public List<T_familys> queryAll() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("from T_familys");
        List list=query.list();
        session.close();
        return list;
    }

    @Override
    public T_familys query(String p) {
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
    public Pager<T_familys> pagerList(Pager pager) {
        return null;
    }
}
