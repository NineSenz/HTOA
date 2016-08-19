package com.ht.action;

import com.ht.bean.T_beonduty;
import com.ht.service.T_beondutyService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_beondutyAction {
    private T_beondutyService t_beondutyService;
    private T_beonduty t_beonduty;

    public void setT_beondutyService(T_beondutyService t_beondutyService) {
        this.t_beondutyService = t_beondutyService;
    }

    public void setT_beonduty(T_beonduty t_beonduty) {
        this.t_beonduty = t_beonduty;
    }

    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_beonduty.setT_BeondutyTime(date);
        t_beonduty.setT_staff_id("1");
        t_beonduty.setT_beonduty_id("1");
        t_beonduty.setT_record("diao");
        t_beonduty.setT_scope("mao");
        t_beondutyService.save(t_beonduty);
        t_beondutyService.save(t_beonduty);
        return "save";
    }

    public String delete(){
        t_beonduty.setT_beonduty_id("1");
        t_beondutyService.delete(t_beonduty);
        return "delete";
    }

    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_beonduty.setT_BeondutyTime(date);
        t_beonduty.setT_staff_id("11");
        t_beonduty.setT_beonduty_id("1");
        t_beonduty.setT_record("改diao");
        t_beonduty.setT_scope("改mao");
        t_beondutyService.update(t_beonduty);
        return "update";
    }


    public String queryAll(){
        List<T_beonduty> list = t_beondutyService.queryAll();
        for(T_beonduty beo : list){
            System.out.println(beo);
        }

        return "queryAll";
    }


}
