package com.ht.service;

import com.ht.bean.T_students;
import com.ht.dao.T_studentsDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_studentsServiceImpl implements T_studentsService{
    private T_studentsDAO t_studentsDAO;

    public void setT_studentsDAO(T_studentsDAO t_studentsDAO) {
        this.t_studentsDAO = t_studentsDAO;
    }

    @Override
    public void save(T_students t_students) {
        t_studentsDAO.save(t_students);
    }

    @Override
    public void delete(T_students t_students) {
        t_studentsDAO.delete(t_students);
    }

    @Override
    public T_students update(T_students t_students) {
        return t_studentsDAO.update(t_students);
    }

    @Override
    public List<T_students> queryAll() {
        return t_studentsDAO.queryAll();
    }

    @Override
    public T_students query(String p) {
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
    public Pager4EasyUI<T_students> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
