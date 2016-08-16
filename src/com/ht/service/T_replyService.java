package com.ht.service;

import com.ht.bean.T_reply;

import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public interface T_replyService {
    public void save(T_reply t_reply);
    public void delete(T_reply t_reply);
    public T_reply update(T_reply t_reply);
    public List<T_reply> queryAll();
    public T_reply query(String p);
    public void close();
}
