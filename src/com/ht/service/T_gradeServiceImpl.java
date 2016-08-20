package com.ht.service;

import com.ht.bean.T_grade;
import com.ht.dao.T_gradeDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_gradeServiceImpl implements T_gradeService{
    private T_gradeDAO t_gradeDAO;

    public void setT_gradeDAO(T_gradeDAO t_gradeDAO) {
        this.t_gradeDAO = t_gradeDAO;
    }

    @Override
    public T_grade save(T_grade t_grade) {
        return t_gradeDAO.save(t_grade);

    }

    @Override
    public void delete(T_grade t_grade) {
        t_gradeDAO.delete(t_grade);
    }

    @Override
    public T_grade update(T_grade t_grade) {
        return t_gradeDAO.update(t_grade);
    }

    @Override
    public List<T_grade> queryAll() {
        return t_gradeDAO.queryAll();
    }

    @Override
    public T_grade query(String p) {
        return t_gradeDAO.query(p);
    }

    @Override
    public void close() {
        t_gradeDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_grade> pagerList(Pager pager) {
        return null;
    }
}
