package com.ht.service;

import com.ht.bean.T_beonduty;
import com.ht.dao.T_beondutyDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_beondutyServiceImpl implements T_beondutyService{

    private T_beondutyDAO t_beondutyDAO;

    public void setT_beondutyDAO(T_beondutyDAO t_beondutyDAO) {
        this.t_beondutyDAO = t_beondutyDAO;
    }

    @Override
    public void save(T_beonduty t_beonduty) {
        t_beondutyDAO.save(t_beonduty);
    }

    @Override
    public void delete(T_beonduty t_beonduty) {
        t_beondutyDAO.delete(t_beonduty);
    }

    @Override
    public T_beonduty update(T_beonduty t_beonduty) {
        return t_beondutyDAO.update(t_beonduty);
    }

    @Override
    public List<T_beonduty> queryAll() {
        return t_beondutyDAO.queryAll();
    }

    @Override
    public T_beonduty query(String p) {
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
    public Pager<T_beonduty> pagerList(Pager pager) {
        return null;
    }
}
