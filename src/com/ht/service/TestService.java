package com.ht.service;

import com.ht.bean.TTest;
import com.ht.util.Pager4EasyUI;

/**
 * Created by GMB on 2016/8/11.
 */
public interface TestService {
    public void save(TTest test);
    public TTest query(String id);
    public Pager4EasyUI<TTest> pagerList(Pager4EasyUI pager);

}
