package com.ht.service;

import com.ht.bean.T_tickling;
import com.ht.dao.T_ticklingDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_ticklingServiceImpl implements T_ticklingService{

    private T_ticklingDAO t_ticklingDAO;

    public void setT_ticklingDAO(T_ticklingDAO t_ticklingDAO) {
        this.t_ticklingDAO = t_ticklingDAO;
    }

    @Override
    public void save(T_tickling t_tickling) {
        t_ticklingDAO.save(t_tickling);
    }

    @Override
    public void delete(T_tickling t_tickling) {
        t_ticklingDAO.delete(t_tickling);
    }

    @Override
    public T_tickling update(T_tickling t_tickling) {
        return t_ticklingDAO.update(t_tickling);
    }

    @Override
    public List<T_tickling> queryAll() {
        return t_ticklingDAO.queryAll();
    }

    @Override
    public T_tickling query(String p) {
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
    public Pager<T_tickling> pagerList(Pager pager) {
        return null;
    }
}
