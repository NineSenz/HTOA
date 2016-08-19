package com.ht.service;

import com.ht.bean.T_dormitory;
import com.ht.dao.T_dormitoryDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_dormitoryServiceImpl implements T_dormitoryService{
    private T_dormitoryDAO t_dormitoryDAO;

    public void setT_dormitoryDAO(T_dormitoryDAO t_dormitoryDAO) {
        this.t_dormitoryDAO = t_dormitoryDAO;
    }

    @Override
    public void save(T_dormitory t_dormitory) {
        t_dormitoryDAO.save(t_dormitory);
    }

    @Override
    public void delete(T_dormitory t_dormitory) {
        t_dormitoryDAO.delete(t_dormitory);
    }

    @Override
    public T_dormitory update(T_dormitory t_dormitory) {

        return t_dormitoryDAO.update(t_dormitory);
    }

    @Override
    public List<T_dormitory> queryAll() {

        return t_dormitoryDAO.queryAll();
    }

    @Override
    public T_dormitory query(String p) {
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
    public Pager<T_dormitory> pagerList(Pager pager) {
        return null;
    }
}
