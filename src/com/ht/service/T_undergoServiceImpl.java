package com.ht.service;

import com.ht.bean.T_undergo;
import com.ht.dao.T_undergoDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_undergoServiceImpl implements T_undergoService{
    private T_undergoDAO t_undergoDAO;

    public void setT_undergoDAO(T_undergoDAO t_undergoDAO) {
        this.t_undergoDAO = t_undergoDAO;
    }

    @Override
    public T_undergo save(T_undergo t_undergo) {
        return t_undergoDAO.save(t_undergo);

    }

    @Override
    public void delete(T_undergo t_undergo) {
        t_undergoDAO.delete(t_undergo);
    }

    @Override
    public T_undergo update(T_undergo t_undergo) {
        return t_undergoDAO.update(t_undergo);
    }

    @Override
    public List<T_undergo> queryAll() {
        return t_undergoDAO.queryAll();
    }

    @Override
    public T_undergo query(String p) {
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
    public Pager<T_undergo> pagerList(Pager pager) {
        return null;
    }
}
