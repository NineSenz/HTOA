package com.ht.service;

import com.ht.bean.T_workcheckunusual;
import com.ht.dao.T_workcheckunusualDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_workcheckunusualServiceImpl implements T_workcheckunusualService {
    private T_workcheckunusualDAO t_workcheckunusualDAO;

    public void setT_workcheckunusualDAO(T_workcheckunusualDAO t_workcheckunusualDAO) {
        this.t_workcheckunusualDAO = t_workcheckunusualDAO;
    }

    @Override
    public T_workcheckunusual save(T_workcheckunusual t_workcheckunusual) {
        return t_workcheckunusualDAO.save(t_workcheckunusual);

    }

    @Override
    public void delete(T_workcheckunusual t_workcheckunusual) {
        t_workcheckunusualDAO.delete(t_workcheckunusual);
    }

    @Override
    public T_workcheckunusual update(T_workcheckunusual t_workcheckunusual) {

        return t_workcheckunusualDAO.update(t_workcheckunusual);
    }

    @Override
    public List<T_workcheckunusual> queryAll() {

        return t_workcheckunusualDAO.queryAll();
    }

    @Override
    public T_workcheckunusual query(String p) {
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
    public Pager<T_workcheckunusual> pagerList(Pager pager) {
        return null;
    }
}
