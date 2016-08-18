package com.ht.service;

import com.ht.bean.T_opinion;
import com.ht.dao.T_opinionDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_opinionServiceImpl implements T_opinionService{
    private T_opinionDAO t_opinionDAO;

    public void setT_opinionDAO(T_opinionDAO t_opinionDAO) {
        this.t_opinionDAO = t_opinionDAO;
    }

    @Override
    public void save(T_opinion t_opinion) {
        t_opinionDAO.save(t_opinion);
    }

    @Override
    public void delete(T_opinion t_opinion) {
        t_opinionDAO.delete(t_opinion);
    }

    @Override
    public T_opinion update(T_opinion t_opinion) {
        return t_opinionDAO.update(t_opinion);
    }

    @Override
    public List<T_opinion> queryAll() {
        return t_opinionDAO.queryAll();
    }

    @Override
    public T_opinion query(String p) {
        return t_opinionDAO.query(p);
    }

    @Override
    public void close() {
        t_opinionDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_opinion> pagerList(Pager pager) {
        return null;
    }
}
