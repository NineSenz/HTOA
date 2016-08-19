package com.ht.service;

import com.ht.bean.TTest;
import com.ht.dao.TestDAO;
import com.ht.util.Pager;

import java.util.List;

/**
 * Created by GMB on 2016/8/11.
 */
public class TestServiceImpl implements TestService {
    private TestDAO testDAO;

    public void setDao(TestDAO testDAO) {
        this.testDAO = testDAO;
    }
    @Override
    public void save(TTest test) {
        testDAO.save(test);
    }

    @Override
    public void delete(TTest test) {
        testDAO.delete(test);
    }

    @Override
    public TTest update(TTest test) {
        return testDAO.update(test);
    }

    @Override
    public List<TTest> queryAll() {
        return testDAO.queryAll();
    }

    @Override
    public TTest query(String id) {
        return testDAO.query(id);
    }

    @Override
    public void close() {
        testDAO.close();
    }

    @Override
    public int count() {
        return testDAO.count();
    }

    @Override
    public Pager<TTest> pagerList(Pager pager) {
        return testDAO.pagerList(pager);
    }
}
