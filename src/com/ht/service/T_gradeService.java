package com.ht.service;

import com.ht.bean.T_grade;

import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public interface T_gradeService {
    public void save(T_grade t_grade);
    public void delete(T_grade t_grade);
    public T_grade update(T_grade t_grade);
    public List<T_grade> queryAll();
    public T_grade query(String p);
    public void close();
}
