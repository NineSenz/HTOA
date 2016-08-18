package com.ht.service;

import com.ht.bean.T_seminar;
import com.ht.util.Pager;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public interface T_seminarService {
    public void save(T_seminar t_seminar);
    public void delete(T_seminar t_seminar);
    public T_seminar update(T_seminar t_seminar);
    public List<T_seminar> queryAll();
    public T_seminar query(String p);
    public void close();
    public int count();
    public Pager<T_seminar> pagerList(Pager pager);
}
