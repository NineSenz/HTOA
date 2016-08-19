package com.ht.service;

import com.ht.bean.T_income;
import com.ht.dao.T_computerDAO;
import com.ht.dao.T_incomeDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_incomeServiceImpl implements T_incomeService {

    private T_income t_income;
    private T_incomeDAO t_incomeDAO;

    public void setT_incomeDAO(T_incomeDAO t_incomeDAO) {
        this.t_incomeDAO = t_incomeDAO;
    }

    @Override
    public void save(T_income t_income) {
        t_incomeDAO.save(t_income);
    }

    @Override
    public void delete(T_income t_income) {
        t_incomeDAO.delete(t_income);
    }

    @Override
    public T_income update(T_income t_income) {
        return t_incomeDAO.update(t_income);
    }

    @Override
    public List<T_income> queryAll() {
        return t_incomeDAO.queryAll();
    }

    @Override
    public T_income query(String p) {
        return t_incomeDAO.query(p);
    }

    @Override
    public void close() {
        t_incomeDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_income> pagerList(Pager pager) {
        return null;
    }
}
