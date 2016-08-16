package com.ht.service;

import com.ht.bean.T_feedback;
import com.ht.dao.T_feedbackDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_feedbackServiceImpl implements T_feedbackService {
    private T_feedbackDAO t_feedbackDAO;

    public void setT_feedbackDAO(T_feedbackDAO t_feedbackDAO) {
        this.t_feedbackDAO = t_feedbackDAO;
    }

    @Override
    public void save(T_feedback t_feedback) {
        t_feedbackDAO.save(t_feedback);
    }

    @Override
    public void delete(T_feedback t_feedback) {
        t_feedbackDAO.delete(t_feedback);
    }

    @Override
    public T_feedback update(T_feedback t_feedback) {
        return t_feedbackDAO.update(t_feedback);
    }

    @Override
    public List<T_feedback> queryAll() {
        return t_feedbackDAO.queryAll();
    }

    @Override
    public T_feedback query(String p) {
        return t_feedbackDAO.query(p);
    }

    @Override
    public void close() {
        t_feedbackDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager4EasyUI<T_feedback> Pagelist(Pager4EasyUI pager) {
        return null;
    }
}
