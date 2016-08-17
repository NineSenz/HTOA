package com.ht.action;

import com.ht.bean.T_rap;
import com.ht.service.T_rapService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_rapAction extends ActionSupport {
    private T_rapService t_rapService;
    private T_rap t_rap;

    public void setT_rapService(T_rapService t_rapService) {
        this.t_rapService = t_rapService;
    }

    public void setT_rap(T_rap t_rap) {
        this.t_rap = t_rap;
    }
    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_rap.setT_rap_id("6");
        t_rap.setT_rap_title("dfg");
        t_rap.setT_rap_datails("fd");
        t_rap.setT_rap_stuid("55");
        t_rap.setT_rap_time(date);
        t_rap.setT_rap_status(3);
        t_rapService.save(t_rap);
        return "save";
    }
    public String delete(){
        t_rap.setT_rap_id("6");
        t_rapService.delete(t_rap);
        return "delete";
    }
    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_rap.setT_rap_id("6");
        t_rap.setT_rap_title("sd");
        t_rap.setT_rap_datails("sd");
        t_rap.setT_rap_stuid("sd");
        t_rap.setT_rap_time(date);
        t_rap.setT_rap_status(6);
        t_rapService.update(t_rap);
        return "update";
    }
    public String queryAll(){
        List<T_rap> list=t_rapService.queryAll();
        for (T_rap rap:list){
            System.out.println(rap);
        }
        return "queryAll";
    }
}
