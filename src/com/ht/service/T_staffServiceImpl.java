package com.ht.service;

import com.ht.bean.T_staff;
import com.ht.dao.T_staffDAO;

import java.util.List;

/**
 * Created by DengMin on 2016/8/12.
 */
public class T_staffServiceImpl implements T_staffService{
    private T_staffDAO t_staffDAO;

    public void setT_staffDAO(T_staffDAO t_staffDAO) {
        this.t_staffDAO = t_staffDAO;
    }

    @Override
    public T_staff update(T_staff t_staff) {
        return t_staffDAO.update(t_staff);
    }

    @Override
    public List<T_staff> queryAll() {
        return t_staffDAO.queryAll();
    }

    @Override
    public void save(T_staff t_staff) {
        t_staffDAO.save(t_staff);
    }

    @Override
    public void delete(T_staff t_staff) {
        t_staffDAO.delete(t_staff);
    }
}
