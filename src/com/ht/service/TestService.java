package com.ht.service;

import com.ht.bean.TTest;
import com.ht.util.Pager;

/**
 * Created by GMB on 2016/8/11.
 */
public interface TestService {
    public void save(TTest test);
    public TTest query(String id);
    public Pager<TTest> pagerList(Pager pager);

}
