package com.ht.dao;

import com.ht.bean.T_department;
import com.ht.bean.T_ssummarize;
import com.ht.util.Pager4EasyUI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_ssummarizeDAOImpl implements T_ssummarizeDAO{

    private SessionFactory sessionFactory;
    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(T_ssummarize t_ssummarize) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_ssummarize);
        session.getTransaction().commit();
    }
    @Override
    public void delete(T_ssummarize t_ssummarize) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_ssummarize);
        session.getTransaction().commit();
    }

    @Override
    public T_ssummarize query(String t_ssummarize) {

        return null;
    }

    @Override
    public List<T_ssummarize> queryAll() {
        session=sessionFactory.openSession();
        Query que=session.createQuery("from T_ssummarize");
        List<T_ssummarize> list=que.list();
        session.close();
        return list;
    }

    @Override
    public T_ssummarize update(T_ssummarize t_ssummarize) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(t_ssummarize);
        session.getTransaction().commit();
        return t_ssummarize;
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager4EasyUI<T_ssummarize> Pagelist(Pager4EasyUI pager) {
        return null;
    }
}
