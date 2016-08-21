package com.ht.action;

import com.ht.bean.TTest;
import com.ht.service.TestService;
import com.ht.util.ControllerResult;
import com.ht.util.Pager;
import com.ht.util.StampUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestAction extends ActionSupport{
    private TestService testService;
    private TTest test;
    private Pager<TTest> pager;
    private List<TTest> rows;
    private int total;
    private String name;
    private double money;
    private String birth;
    private String id;
    private ControllerResult result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public ControllerResult getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public String getBirth() {
        return birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public List<TTest> getRows() {
        return rows;
    }

    public int getTotal() {
        return total;
    }

    public void setPager(Pager<TTest> pager) {
        this.pager = pager;
    }

    public void setTest(TTest test) {
        this.test = test;
    }
    public TTest getTest(){
        return test;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }


    public String query() throws ParseException {
        test = testService.query(test.getId());
        System.out.println(test);
        return "query";
    }
    public String save()throws ParseException{
        test.setId(StampUtil.getStamp());
        String dt = StampUtil.getDate();
        TTest obj = testService.save(test);
        if(obj!=null){
            result = ControllerResult.getSuccessResult("添加成功!");
        }else{
            result = ControllerResult.getFailResult("添加失败!");
        }
        System.out.println("result"+result);
        return SUCCESS;
    }
    public String remove(){
        test.setId(id);
        testService.delete(test);
        result = ControllerResult.getSuccessResult("删除成功!");
        System.out.println("result"+result);
        return SUCCESS;
    }
    public String update(){
        test.setId(id);
        test.setName(name);
        test.setMoney(money);
        test.setBirth(birth);
        testService.update(test);
        if((testService.update(test))!=null){
            result = ControllerResult.getSuccessResult("修改成功!");
            System.out.println(result);
        }else{
            result = ControllerResult.getFailResult("修改失败!");
            System.out.println(result);
        }
        return SUCCESS;
    }
    public String pagerList(){
        HttpServletRequest req = ServletActionContext.getRequest();
        pager.setPageNo(Integer.parseInt(req.getParameter("page")));
        pager.setPageSize(Integer.parseInt(req.getParameter("rows")));
        pager = testService.pagerList(pager);
        rows = pager.getRows();
        total = pager.getTotal();
        //testDAO.close();
        return SUCCESS;
    }
}
