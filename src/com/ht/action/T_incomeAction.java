package com.ht.action;

import com.ht.bean.T_income;
import com.ht.service.T_incomeService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_incomeAction extends ActionSupport {
    private T_incomeService t_incomeService;
    private T_income t_income;

    public void setT_incomeService(T_incomeService t_incomeService) {
        this.t_incomeService = t_incomeService;
    }

    public void setT_income(T_income t_income) {
        this.t_income = t_income;
    }

    public String save(){
        t_income.setT_inc_id("123");
        t_income.setT_inc_money("123");
        t_income.setT_inc_cause("123");
        t_income.setT_inc_balid("123");
        t_income.setT_inc_time("123");
        return "save";
    }

    public String delete(){
        t_income.setT_inc_id("123");
        t_incomeService.delete(t_income);
        return "delete";
    }

    public String update(){
        t_income = t_incomeService.update(t_income);
        return "update";
    }

    public String query(){
        t_income = t_incomeService.query("123");
        System.out.println(t_income);
        return "query";
    }

    public String queryAll() {
        t_incomeService.queryAll();
        t_incomeService.close();
        return "queryAll";
    }
}
