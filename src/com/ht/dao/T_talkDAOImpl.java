package com.ht.dao;

import com.ht.bean.T_talk;
import com.ht.util.Pager;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 * Created by Tom on 2016/8/16.
 */
public class T_talkDAOImpl implements T_talkDAO{

    private SessionFactory sessionFactory;
    private Session session;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void save(T_talk t_talk) {
        session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(t_talk);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T_talk t_talk) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(t_talk);
        session.getTransaction().commit();
        System.out.println("id="+t_talk.getT_talk_id());
    }

    @Override
    public T_talk update(T_talk t_talk) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(t_talk);
        session.getTransaction().commit();
        return t_talk;
    }

    @Override
    public List<T_talk> queryAll() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from T_talk");
        List<T_talk> list = query.list();
        return list;
    }

    @Override
    public T_talk query(String p) {
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
    public Pager<T_talk> pagerList(Pager pager) {
        return null;
    }
}
