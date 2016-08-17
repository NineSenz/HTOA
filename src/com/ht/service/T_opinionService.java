package com.ht.service;

import com.ht.bean.T_opinion;
import com.ht.util.Pager4EasyUI;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public interface T_opinionService {
    public void save(T_opinion t_opinion);
    public void delete(T_opinion t_opinion);
    public T_opinion update(T_opinion t_opinion);
    public List<T_opinion> queryAll();
    public T_opinion query(String p);
    public void close();
    public int count();
    public Pager4EasyUI<T_opinion> pagerList(Pager4EasyUI pager);
}
