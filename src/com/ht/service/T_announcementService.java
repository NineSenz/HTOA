package com.ht.service;

import com.ht.bean.T_announcement;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public interface T_announcementService {
    public void save(T_announcement t_announcement);
    public void delete(T_announcement t_announcement);
    public T_announcement update(T_announcement t_announcement);
    public List<T_announcement> queryAll();
    public T_announcement query(String p);
    public void close();
    public int count();
    public Pager4EasyUI<T_announcement> pagerList(Pager4EasyUI pager);
}
