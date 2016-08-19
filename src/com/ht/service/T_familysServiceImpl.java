package com.ht.service;

import com.ht.bean.T_familys;
import com.ht.dao.T_familysDAO;
import java.util.List;
import com.ht.util.Pager;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_familysServiceImpl implements T_familysService{
    private T_familysDAO t_familysDAO;

    public void setT_familysDAO(T_familysDAO t_familysDAO) {
        this.t_familysDAO = t_familysDAO;
    }

    @Override
    public void save(T_familys t_familys) {
        t_familysDAO.save(t_familys);
    }

    @Override
    public void delete(T_familys t_familys) {
        t_familysDAO.delete(t_familys);
    }

    @Override
    public T_familys update(T_familys t_familys) {
        return t_familysDAO.update(t_familys);
    }

    @Override
    public List<T_familys> queryAll() {
        return t_familysDAO.queryAll();
    }

    @Override
    public T_familys query(String p) {
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
    public Pager<T_familys> pagerList(Pager pager) {
        return null;
    }
}
