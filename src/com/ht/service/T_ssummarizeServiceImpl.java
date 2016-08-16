package com.ht.service;

import com.ht.bean.T_ssummarize;
import com.ht.dao.T_ssummarizeDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_ssummarizeServiceImpl implements T_ssummarizeService {

    private T_ssummarizeDAO t_ssummarizeDAO;

    public void setT_ssummarizeDAO(T_ssummarizeDAO t_ssummarizeDAO) {
        this.t_ssummarizeDAO = t_ssummarizeDAO;
    }

    @Override
    public void save(T_ssummarize t_ssummarize) {
        t_ssummarizeDAO.save(t_ssummarize);
    }

    @Override
    public void delete(T_ssummarize t_ssummarize) {
        t_ssummarizeDAO.delete(t_ssummarize);
    }

    @Override
    public T_ssummarize query(String p) {
        return t_ssummarizeDAO.query(p);
    }

    @Override
    public List<T_ssummarize> queryAll() {
        return t_ssummarizeDAO.queryAll();
    }

    @Override
    public T_ssummarize update(T_ssummarize t_ssummarize) {
        return t_ssummarizeDAO.update(t_ssummarize);
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager4EasyUI<T_ssummarize> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
