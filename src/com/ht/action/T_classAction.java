package com.ht.action;

import com.ht.bean.T_class;
import com.ht.service.T_classService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_classAction extends ActionSupport {
    private T_classService t_classService;
    private T_class t_class;

    public void setT_classService(T_classService t_classService) {
        this.t_classService = t_classService;
    }

    public void setT_class(T_class t_class) {
        this.t_class = t_class;
    }
    public String add(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_class.setT_cla_id("1");
        t_class.setT_cla_name("bigbang");
        t_class.setT_cla_num("g");
        t_class.setT_cla_teach("d");
        t_class.setT_cla_coach("t");
        t_class.setT_cla_claadm("o");
        t_class.setT_cla_adds("p");
        t_class.setT_cla_create(date);
        t_classService.save(t_class);
        return "save";
    }
    public String delete(){
        t_class.setT_cla_id("1");
        t_classService.delete(t_class);
        return "delete";
    }
    public String update(){
        t_class.setT_cla_id("1");
        t_class.setT_cla_name("大爆炸");
        t_classService.update(t_class);
        return "update";
    }
    public String queryAll(){
        List<T_class> list=t_classService.queryAll();
        for (T_class t_class:list){
            System.out.println(t_class);
        }
        return "queryAll";
    }
}
