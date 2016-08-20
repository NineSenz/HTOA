package com.ht.service;

import com.ht.bean.T_reply;
import com.ht.dao.T_replyDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_replyServiceImpl implements T_replyService{
    private T_replyDAO t_replyDAO;

    public void setT_replyDAO(T_replyDAO t_replyDAO) {
        this.t_replyDAO = t_replyDAO;
    }

    @Override
    public T_reply save(T_reply t_reply) {
        return t_replyDAO.save(t_reply);

    }

    @Override
    public void delete(T_reply t_reply) {
        t_replyDAO.delete(t_reply);
    }

    @Override
    public T_reply update(T_reply t_reply) {
        return t_replyDAO.update(t_reply);
    }

    @Override
    public List<T_reply> queryAll() {
        return t_replyDAO.queryAll();
    }

    @Override
    public T_reply query(String p) {
        return t_replyDAO.query(p);
    }

    @Override
    public void close() {
        t_replyDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_reply> pagerList(Pager pager) {
        return null;
    }
}
