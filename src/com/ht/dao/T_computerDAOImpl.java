package com.ht.dao;

import com.ht.bean.T_computer;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_computerDAOImpl implements T_computerDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session session;

    @Override
    public void save(T_computer t_computer) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_computer);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_computer t_computer) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_computer);
        session.getTransaction().commit();
    }

    @Override
    public T_computer update(T_computer t_computer) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_computer);
        session.getTransaction().commit();
        return t_computer;
    }

    @Override
    public List<T_computer> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_computer");
        List<T_computer> list = query.list();
        return list;
    }

    @Override
    public T_computer query(String p) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_computer t where t_comp_id =:id");
        query.setString("id",p);
        T_computer t_computer = (T_computer) query.uniqueResult();
        session.getTransaction().commit();
        return t_computer;
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
    public Pager4EasyUI<T_computer> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
