package com.ht.service;

import com.ht.bean.T_income;

import java.util.List;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public interface T_incomeService {
    public void save(T_income t_income);
    public void delete(T_income t_income);
    public T_income update(T_income t_income);
    public List<T_income> queryAll();
    public T_income query(String p);
    public void close();
}
