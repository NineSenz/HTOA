package com.ht.action;

import com.ht.bean.TTest;
import com.ht.service.TestService;
import com.ht.util.StampUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestAction{
    private TestService testService;
    private TTest test;

    public void setTest(TTest test) {
        this.test = test;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public String query() throws ParseException {
        test = testService.query("1470985128000");
        System.out.println(test);
        return "query";
    }
    public String save()throws ParseException{
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        test.setId(StampUtil.dateToStamp(date));
        test.setName("小明");
        test.setMoney(9844.56);
        test.setBirth(date);
        System.out.println(test);
        testService.save(test);
        return "save";
    }
    public String pagerList(){

        return "pager";
    }
}
