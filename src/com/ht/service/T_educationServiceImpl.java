package com.ht.service;


import com.ht.bean.T_education;
import com.ht.dao.T_educationDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_educationServiceImpl implements T_educationService{
    private T_educationDAO t_educationDAO;

    public void setT_educationDAO(T_educationDAO t_educationDAO) {
        this.t_educationDAO = t_educationDAO;
    }


    @Override
    public T_education save(T_education t_education) {
        return t_educationDAO.save(t_education);

    }

    @Override
    public void delete(T_education t_education) {
        t_educationDAO.delete(t_education);
    }

    @Override
    public T_education update(T_education t_education) {
        return t_educationDAO.update(t_education);
    }

    @Override
    public List<T_education> queryAll() {
        return t_educationDAO.queryAll();
    }

    @Override
    public T_education query(String p) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_education> pagerList(Pager pager) {
        return null;
    }
}
