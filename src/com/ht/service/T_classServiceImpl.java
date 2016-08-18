package com.ht.service;

import com.ht.bean.T_class;
import com.ht.dao.T_classDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_classServiceImpl implements T_classService {
    private T_classDAO t_classDAO;

    public void setT_classDAO(T_classDAO t_classDAO) {
        this.t_classDAO = t_classDAO;
    }

    @Override
    public void save(T_class t_class) {
        t_classDAO.save(t_class);
    }

    @Override
    public void delete(T_class t_class) {
        t_classDAO.delete(t_class);
    }

    @Override
    public T_class update(T_class t_class) {
        return t_classDAO.update(t_class);
    }

    @Override
    public List<T_class> queryAll() {
        return t_classDAO.queryAll();
    }

    @Override
    public T_class query(String p) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_class> pagerList(Pager pager) {
        return null;
    }
}
