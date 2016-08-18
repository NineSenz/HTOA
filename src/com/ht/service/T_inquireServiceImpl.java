package com.ht.service;

import com.ht.bean.T_inquire;
import com.ht.dao.T_inquireDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_inquireServiceImpl implements T_inquireService {
    private T_inquireDAO t_inquireDAO;

    public void setT_inquireDAO(T_inquireDAO t_inquireDAO) {
        this.t_inquireDAO = t_inquireDAO;
    }

    @Override
    public void save(T_inquire t_inquire) {
        t_inquireDAO.save(t_inquire);
    }

    @Override
    public void delete(T_inquire t_inquire) {
        t_inquireDAO.delete(t_inquire);
    }

    @Override
    public T_inquire update(T_inquire t_inquire) {
        return t_inquireDAO.update(t_inquire);
    }

    @Override
    public List<T_inquire> queryAll() {
        return t_inquireDAO.queryAll();
    }

    @Override
    public T_inquire query(String p) {
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
    public Pager<T_inquire> pagerList(Pager pager) {
        return null;
    }
}
