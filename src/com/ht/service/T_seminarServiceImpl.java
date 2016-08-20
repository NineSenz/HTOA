package com.ht.service;

import com.ht.bean.T_seminar;
import com.ht.dao.T_seminarDAO;
import com.ht.util.Pager;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_seminarServiceImpl implements T_seminarService{
    private T_seminarDAO t_seminarDAO;

    public void setT_seminarDAO(T_seminarDAO t_seminarDAO) {
        this.t_seminarDAO = t_seminarDAO;
    }

    @Override
    public T_seminar save(T_seminar t_seminar) {
        return t_seminarDAO.save(t_seminar);

    }

    @Override
    public void delete(T_seminar t_seminar) {
        t_seminarDAO.delete(t_seminar);
    }

    @Override
    public T_seminar update(T_seminar t_seminar) {
        return t_seminarDAO.update(t_seminar);
    }

    @Override
    public List<T_seminar> queryAll() {
        return t_seminarDAO.queryAll();
    }

    @Override
    public T_seminar query(String p) {
        return t_seminarDAO.query(p);
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_seminar> pagerList(Pager pager) {
        return null;
    }
}
