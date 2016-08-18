package com.ht.service;

import com.ht.bean.T_admin;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by please fresh on 2016/8/12.
 */
public interface T_adminService {
    public void save(T_admin t_admin);
    public void delete(T_admin t_admin);
    public T_admin update(T_admin t_admin);
    public List<T_admin> queryAll();
    public T_admin query(String p);
    public void close();
    public Pager<T_admin> pagerList(Pager Pager);
}
