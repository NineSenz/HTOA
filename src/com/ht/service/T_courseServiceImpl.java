package com.ht.service;

import com.ht.bean.T_course;
import com.ht.dao.T_courseDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_courseServiceImpl implements T_courseService{
    private T_courseDAO t_courseDAO;

    public void setT_courseDAO(T_courseDAO t_courseDAO) {
        this.t_courseDAO = t_courseDAO;
    }

    @Override
    public void save(T_course t_course) {
        t_courseDAO.save(t_course);
    }

    @Override
    public void delete(T_course t_course) {
        t_courseDAO.delete(t_course);
    }

    @Override
    public T_course update(T_course t_course) {
        return t_courseDAO.update(t_course);
    }

    @Override
    public List<T_course> queryAll() {
        return t_courseDAO.queryAll();
    }

    @Override
    public T_course query(String p) {
        return t_courseDAO.query(p);
    }

    @Override
    public void close() {
        t_courseDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_course> pagerList(Pager pager) {
        return null;
    }
}
