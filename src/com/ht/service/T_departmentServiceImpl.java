package com.ht.service;

import com.ht.bean.T_department;
import com.ht.dao.T_departmentDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by liujie on 2016/8/12.
 */
public class T_departmentServiceImpl implements T_departmentService{
    private T_departmentDAO t_departmentDAO;

    public void setT_departmentDAO(T_departmentDAO t_departmentDAO) {
        this.t_departmentDAO = t_departmentDAO;
    }

    @Override
    public void save(T_department t_department) {
        t_departmentDAO.save(t_department);
    }

    @Override
    public void delete(T_department t_department) {
        t_departmentDAO.delete(t_department);
    }

    @Override
    public T_department update(T_department t_department) {

        return t_departmentDAO.update(t_department);
    }

    @Override
    public List<T_department> queryAll() {
        return t_departmentDAO.queryAll();
    }

    @Override
    public T_department query(String p) {
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
    public Pager4EasyUI<T_department> Pagelist(Pager4EasyUI pager) {
        return null;
    }
}
