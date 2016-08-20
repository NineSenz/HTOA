package com.ht.service;

import com.ht.bean.T_talk;
import com.ht.dao.T_talkDAO;
import com.ht.util.Pager;


import java.util.List;

/**
 * Created by Tom on 2016/8/16.
 */
public class T_talkServiceImpl implements T_talkService{
    private T_talkDAO t_talkDAO;

    public void setT_talkDAO(T_talkDAO t_talkDAO) {
        this.t_talkDAO = t_talkDAO;
    }

    @Override
    public T_talk save(T_talk t_talk) {
        return t_talkDAO.save(t_talk);

    }

    @Override
    public void delete(T_talk t_talk){
        t_talkDAO.delete(t_talk);
    }

    @Override
    public T_talk update(T_talk t_talk) {
        return t_talkDAO.update(t_talk);
    }

    @Override
    public List<T_talk> queryAll() {
        return t_talkDAO.queryAll();
    }

    @Override
    public T_talk query(String p) {
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
    public Pager<T_talk> pagerList(Pager pager) {
        return null;
    }
}
