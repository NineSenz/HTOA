package com.ht.service;

import com.ht.bean.T_obtainjob;
import com.ht.dao.T_obtainjobDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_obtainjobServiceImpl implements T_obtainjobService {

    private T_obtainjobDAO t_obtainjobDAO;

    public void setT_obtainjobDAO(T_obtainjobDAO t_obtainjobDAO) {
        this.t_obtainjobDAO = t_obtainjobDAO;
    }

    @Override
    public void save(T_obtainjob t_obtainjob) {
        t_obtainjobDAO.save(t_obtainjob);
    }

    @Override
    public void delete(T_obtainjob t_obtainjob) {

    }

    @Override
    public T_obtainjob update(T_obtainjob t_obtainjob) {
        return null;
    }

    @Override
    public List<T_obtainjob> queryAll() {
        return null;
    }

    @Override
    public T_obtainjob query(String p) {
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
    public Pager4EasyUI<T_obtainjob> pagerList(Pager4EasyUI pager) {

        return null;
    }
}
