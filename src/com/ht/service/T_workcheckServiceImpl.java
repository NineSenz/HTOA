package com.ht.service;

import com.ht.bean.T_workcheck;
import com.ht.dao.T_workcheckDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_workcheckServiceImpl implements T_workcheckService{
    private T_workcheckDAO t_workcheckDAO;

    public void setT_workcheckDAO(T_workcheckDAO t_workcheckDAO) {
        this.t_workcheckDAO = t_workcheckDAO;
    }

    @Override
    public T_workcheck save(T_workcheck t_workcheck) {
        return t_workcheckDAO.save(t_workcheck);

    }

    @Override
    public void delete(T_workcheck t_workcheck) {
        t_workcheckDAO.delete(t_workcheck);
    }

    @Override
    public T_workcheck update(T_workcheck t_workcheck) {
        return t_workcheckDAO.update(t_workcheck);
    }

    @Override
    public List<T_workcheck> queryAll() {
        return t_workcheckDAO.queryAll();
    }

    @Override
    public T_workcheck query(String p) {
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
    public Pager<T_workcheck> pagerList(Pager pager) {
        return null;
    }
}
