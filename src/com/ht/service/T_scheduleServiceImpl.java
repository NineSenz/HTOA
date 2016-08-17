package com.ht.service;

import com.ht.bean.T_schedule;
import com.ht.dao.T_scheduleDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_scheduleServiceImpl implements T_scheduleService {
    private T_scheduleDAO t_scheduleDAO;

    public void setT_scheduleDAO(T_scheduleDAO t_scheduleDAO) {
        this.t_scheduleDAO = t_scheduleDAO;
    }

    @Override
    public void save(T_schedule t_schedule) {
        t_scheduleDAO.save(t_schedule);
    }

    @Override
    public void delete(T_schedule t_schedule) {
        t_scheduleDAO.delete(t_schedule);
    }

    @Override
    public T_schedule update(T_schedule t_schedule) {
        return t_scheduleDAO.update(t_schedule);
    }

    @Override
    public List<T_schedule> queryAll() {
        return t_scheduleDAO.queryAll();
    }

    @Override
    public T_schedule query(String p) {
        return  t_scheduleDAO.query(p);
    }

    @Override
    public void close() {
        t_scheduleDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager4EasyUI<T_schedule> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
