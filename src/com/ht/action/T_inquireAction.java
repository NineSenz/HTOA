package com.ht.action;

import com.ht.bean.T_inquire;
import com.ht.dao.T_inquireDAO;
import com.ht.service.T_inquireService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_inquireAction extends ActionSupport {
    private T_inquireService t_inquireService;
    private T_inquire t_inquire;

    public void setT_inquireService(T_inquireService t_inquireService) {
        this.t_inquireService = t_inquireService;
    }

    public void setT_inquire(T_inquire t_inquire) {
        this.t_inquire = t_inquire;
    }
    public String add(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_inquire.setT_inq_id("2");
        t_inquire.setT_staff_id("gh");
        t_inquire.setT_inq_name("as");
        t_inquire.setT_inq_time(date);
        t_inquireService.save(t_inquire);
        return "save";
    }
    public String delete(){
        t_inquire.setT_inq_id("2");
        t_inquireService.delete(t_inquire);
        return "delete";
    }
    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_inquire.setT_inq_id("2");
        t_inquire.setT_inq_name("hehe");
        t_inquire.setT_staff_id("6");
        t_inquire.setT_inq_time(date);
        t_inquireService.update(t_inquire);
        return "update";
    }
    public String queryAll(){
        List<T_inquire> list=t_inquireService.queryAll();
        for (T_inquire t_inquire:list){
            System.out.println(t_inquire);
        }
        return "queryAll";
    }
}
