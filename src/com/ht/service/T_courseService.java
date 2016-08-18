package com.ht.service;

import com.ht.bean.T_course;
import com.ht.util.Pager;
import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public interface T_courseService {
    public void save(T_course t_course);
    public void delete(T_course t_course);
    public T_course update(T_course t_course);
    public List<T_course> queryAll();
    public T_course query(String p);
    public void close();
    public int count();
    public Pager<T_course> Pagelist(Pager pager);
}
