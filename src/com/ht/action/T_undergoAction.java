package com.ht.action;

import com.ht.bean.T_undergo;
import com.ht.service.T_undergoService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_undergoAction extends ActionSupport {
    private T_undergoService t_undergoService;
    private T_undergo t_undergo;

    public void setT_undergoService(T_undergoService t_undergoService) {
        this.t_undergoService = t_undergoService;
    }

    public void setT_undergo(T_undergo t_undergo) {
        this.t_undergo = t_undergo;
    }
    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_undergo.setT_undergo_id("96");
        t_undergo.setT_staff_id("6");
        t_undergo.setT_AirTime(date);
        t_undergo.setT_FinishTime(date);
        t_undergo.setT_FirmName("dfdf");
        t_undergo.setT_FirmPost("df");
        t_undergo.setT_prove("fg");
        t_undergo.setT_ProvePhone("1733");
        t_undergoService.save(t_undergo);
        return "save";
    }
    public String delete(){
        t_undergo.setT_undergo_id("96");
        t_undergoService.delete(t_undergo);
        return "delete";
    }
    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_undergo.setT_undergo_id("96");
        t_undergo.setT_staff_id("6");
        t_undergo.setT_AirTime(date);
        t_undergo.setT_FinishTime(date);
        t_undergo.setT_FirmName("fsd");
        t_undergo.setT_FirmPost("as");
        t_undergo.setT_prove("sd");
        t_undergo.setT_ProvePhone("173309");
        t_undergoService.update(t_undergo);
        return "update";
    }
    public String queryAll(){
        List<T_undergo> list=t_undergoService.queryAll();
        for (T_undergo t_undergo:list){
            System.out.println(t_undergo);
        }
        return "queryAll";
    }
}
