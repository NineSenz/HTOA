package com.ht.action;

import com.ht.bean.TTest;
import com.ht.dao.TestDAO;
import com.ht.service.TestService;
import com.ht.util.Pager;
import com.ht.util.StampUtil;
import org.apache.struts2.json.annotations.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestAction{
    private TestDAO testDAO;
    private TestService testService;
    private TTest test;
    private Pager<TTest> pager;
    private String pageNo;
    private String pageSize;

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public Pager<TTest> getPager() {
        return pager;
    }

    public void setPager(Pager<TTest> pager) {
        this.pager = pager;
    }

    public void setTest(TTest test) {
        this.test = test;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public void setTestDAO(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    public String query() throws ParseException {
        test = testService.query(test.getId());
        System.out.println(test);
        testDAO.close();
        return "query";
    }
    public String save()throws ParseException{
        //save?test.id=45885884&test.name=same&test.money=7845.59&test.birth=2016-10-11 12:25:35
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        test.setId(StampUtil.dateToStamp(date));
        test.setName("小明");
        test.setMoney(9844.56);
        test.setBirth(date);
        System.out.println(test);
        testService.save(test);
        testDAO.close();
        return "save";
    }
    public String update(){

        return "update";
    }
    public String pagerList(){
        pager.setPageNo(Integer.parseInt(pageNo));
        pager.setPageSize(Integer.parseInt(pageSize));
        Pager<TTest> pagerlist = testService.pagerList(pager);
        testDAO.close();
        return "pager";
    }
}
