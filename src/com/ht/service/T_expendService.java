package com.ht.service;

import com.ht.bean.T_expend;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public interface T_expendService {
    public void save(T_expend t_expend);
    public void delete(T_expend t_expend);
    public T_expend update(T_expend t_expend);
    public List<T_expend> queryAll();
    public T_expend query(String p);
    public void close();
}
