package com.ht.service;

import com.ht.bean.T_admin;
import com.ht.dao.T_adminDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by please fresh on 2016/8/12.
 */
public class T_adminServiceImpl implements T_adminService{

    private T_adminDAO t_adminDAO;
    private T_admin t_admin;

    public void setT_adminDAO(T_adminDAO t_adminDAO) {
        this.t_adminDAO = t_adminDAO;
    }

    public void setT_admin(T_admin t_admin) {
        this.t_admin = t_admin;
    }

    @Override
    public void save(T_admin t_admin) {
        t_adminDAO.save(t_admin);
    }

    @Override
    public void delete(T_admin t_admin) {
        t_adminDAO.delete(t_admin);
    }

    @Override
    public T_admin update(T_admin t_admin) {
        return t_adminDAO.update(t_admin);
    }

    @Override
    public List<T_admin> queryAll() {
        return t_adminDAO.queryAll();
    }

    @Override
    public T_admin query(String p) {
        t_admin = t_adminDAO.query(p);
        return t_admin;
    }

    @Override
    public void close() {
        t_adminDAO.close();
    }

    @Override
    public Pager<T_admin> pagerList(Pager Pager) {
        return t_adminDAO.pagerList(Pager);
    }


}
