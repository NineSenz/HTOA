package com.ht.service;

import com.ht.bean.T_journal;
import com.ht.dao.T_journalDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_journalServiceImpl implements T_journalService{
    private T_journalDAO t_journalDAO;

    public void setT_journalDAO(T_journalDAO t_journalDAO) {
        this.t_journalDAO = t_journalDAO;
    }

    @Override
    public void save(T_journal t_journal) {
        t_journalDAO.save(t_journal);
    }

    @Override
    public void delete(T_journal t_journal) {
        t_journalDAO.delete(t_journal);
    }

    @Override
    public T_journal update(T_journal t_journal) {
        return t_journalDAO.update(t_journal);
    }

    @Override
    public List<T_journal> queryAll() {
        return t_journalDAO.queryAll();
    }

    @Override
    public T_journal query(String p) {
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
    public Pager<T_journal> pagerList(Pager pager) {
        return null;
    }
}
