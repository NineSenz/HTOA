package com.ht.service;

import com.ht.bean.TTest;
import com.ht.dao.TestDAO;
import com.ht.util.Pager4EasyUI;

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
    public TTest query(String id) {
        return testDAO.query(id);
    }

    @Override
    public Pager4EasyUI<TTest> pagerList(Pager4EasyUI pager) {
        return testDAO.pagerList(pager);
    }
}
