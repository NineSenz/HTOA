package com.ht.dao;

import com.ht.bean.T_grade;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_gradeDAOImpl implements T_gradeDAO{
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_grade t_grade) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_grade);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_grade t_grade) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_grade);
        session.getTransaction().commit();
    }

    @Override
    public T_grade update(T_grade t_grade) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_grade);
        session.getTransaction().commit();
        return t_grade;
    }

    @Override
    public List<T_grade> queryAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_grade");
        List<T_grade> list = query.list();
        return  list;
    }

    @Override
    public T_grade query(String p) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_grade where t_gr_id=:id");
        query.setString("id",p);
        T_grade t_grade = (T_grade) query.uniqueResult();
        session.getTransaction().commit();
        return t_grade;
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
    public Pager4EasyUI<T_grade> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
