package com.ht.service;

import com.ht.bean.T_computer;
import com.ht.dao.T_computerDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_computerServiceImpl implements T_computerService {
    private T_computer t_computer;
    private T_computerDAO t_computerDAO;

    public void setT_computerDAO(T_computerDAO t_computerDAO) {
        this.t_computerDAO = t_computerDAO;
    }

    @Override
    public void save(T_computer t_computer) {
        t_computerDAO.save(t_computer);
    }

    @Override
    public void delete(T_computer t_computer) {
        t_computerDAO.delete(t_computer);
    }

    @Override
    public T_computer update(T_computer t_computer) {
        return t_computerDAO.update(t_computer);
    }

    @Override
    public List<T_computer> queryAll() {
        return t_computerDAO.queryAll();
    }

    @Override
    public T_computer query(String p) {
        return t_computerDAO.query(p);
    }

    @Override
    public void close() {
        t_computerDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_computer> pagerList(Pager pager) {
        return null;
    }
}
