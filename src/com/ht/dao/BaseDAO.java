package com.ht.dao;

import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by GMB on 2016/8/11.
 */
public interface BaseDAO<T,PK> {
    public void save(T t);
    public void delete(T t);
    public T update(T t);
    public List<T> queryAll();
    public T query(PK p);
    public void close();
    public int count();
    public Pager4EasyUI<T> pagerList(Pager4EasyUI pager);
}
