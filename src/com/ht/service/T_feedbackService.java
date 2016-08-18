package com.ht.service;

import com.ht.bean.T_feedback;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public interface T_feedbackService {
    public void save(T_feedback t_feedback);
    public void delete(T_feedback t_feedback);
    public T_feedback update(T_feedback t_feedback);
    public List<T_feedback> queryAll();
    public T_feedback query(String p);
    public void close();
    public int count();
    public Pager<T_feedback> Pagelist(Pager pager);
}
