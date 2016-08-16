package com.ht.dao;

import com.ht.bean.T_staff;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by DengMin on 2016/8/12.
 */
public class T_staffDAOImpl implements T_staffDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_staff t_staff) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_staff);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_staff t_staff) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_staff);
        session.getTransaction().commit();
    }

    @Override
    public T_staff update(T_staff t_staff) {
        System.out.println("update");
        System.out.println(t_staff.getT_sta_name());
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_staff);
        session.getTransaction().commit();
        return t_staff;
    }

    @Override
    public List<T_staff> queryAll() {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from T_staff");
        List<T_staff> list= query.list();
        return list;
    }

    @Override
    public T_staff query(String p) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_staff t where t_sta_id=:id");
        query.setString("id",p);
        T_staff t_staff = (T_staff) query.uniqueResult();
        session.getTransaction().commit();
        return t_staff;
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
    public Pager4EasyUI<T_staff> pagerList(Pager4EasyUI pager) {
        return null;
    }

}
