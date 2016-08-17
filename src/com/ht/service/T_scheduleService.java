package com.ht.service;

import com.ht.bean.T_schedule;
import com.ht.util.Pager4EasyUI;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public interface T_scheduleService {
    public void save(T_schedule t_schedule);
    public void delete(T_schedule t_schedule);
    public T_schedule update(T_schedule t_schedule);
    public List<T_schedule> queryAll();
    public T_schedule query(String p);
    public void close();
    public int count();
    public Pager4EasyUI<T_schedule> pagerList(Pager4EasyUI pager);
}
