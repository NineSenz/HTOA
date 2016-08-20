package com.ht.service;

import com.ht.bean.T_expend;
import com.ht.dao.T_expendDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_expendServiceImpl implements T_expendService{
    private T_expendDAO t_expendDAO;

    public void setT_expendDAO(T_expendDAO t_expendDAO) {
        this.t_expendDAO = t_expendDAO;
    }


    @Override
    public T_expend save(T_expend t_expend) {
        return t_expendDAO.save(t_expend);

    }

    @Override
    public void delete(T_expend t_expend) {
        t_expendDAO.delete(t_expend);
    }

    @Override
    public T_expend update(T_expend t_expend) {
        return t_expendDAO.update(t_expend);
    }

    @Override
    public List<T_expend> queryAll() {
        return t_expendDAO.queryAll();
    }

    @Override
    public T_expend query(String p) {
        return t_expendDAO.query(p);
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_expend> pagerList(Pager pager) {
        return null;
    }
}
