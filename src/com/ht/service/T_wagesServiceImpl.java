package com.ht.service;

import com.ht.bean.T_wages;
import com.ht.dao.T_wagesDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_wagesServiceImpl implements T_wagesService{
    private T_wagesDAO t_wagesDAO;

    public void setT_wagesDAO(T_wagesDAO t_wagesDAO) {
        this.t_wagesDAO = t_wagesDAO;
    }

    @Override
    public T_wages save(T_wages t_wages) {
        return t_wagesDAO.save(t_wages);

    }

    @Override
    public void delete(T_wages t_wages) {
        t_wagesDAO.delete(t_wages);
    }

    @Override
    public T_wages update(T_wages t_wages) {
        return t_wagesDAO.update(t_wages);
    }

    @Override
    public List<T_wages> queryAll() {
        return t_wagesDAO.queryAll();
    }

    @Override
    public T_wages query(String p) {
        return t_wagesDAO.query(p);
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_wages> pagerList(Pager pager) {
        return null;
    }
}
