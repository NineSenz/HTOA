package com.ht.service;

import com.ht.bean.T_rap;
import com.ht.dao.T_rapDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_rapServiceImpl implements T_rapService {
    private T_rapDAO t_rapDAO;

    public void setT_rapDAO(T_rapDAO t_rapDAO) {
        this.t_rapDAO = t_rapDAO;
    }

    @Override
    public void save(T_rap t_rap) {
        t_rapDAO.save(t_rap);
    }

    @Override
    public void delete(T_rap t_rap) {
        t_rapDAO.delete(t_rap);
    }

    @Override
    public T_rap update(T_rap t_rap) {
        return t_rapDAO.update(t_rap);
    }

    @Override
    public List<T_rap> queryAll() {
        return t_rapDAO.queryAll();
    }

    @Override
    public T_rap query(String p) {
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
    public Pager<T_rap> pagerList(Pager pager) {
        return null;
    }
}
