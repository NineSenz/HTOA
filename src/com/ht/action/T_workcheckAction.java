package com.ht.action;

import com.ht.bean.T_workcheck;
import com.ht.service.T_workcheckService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_workcheckAction {
    private T_workcheckService t_workcheckService;
    private T_workcheck t_workcheck;

    public void setT_workcheckService(T_workcheckService t_workcheckService) {
        this.t_workcheckService = t_workcheckService;
    }

    public void setT_workcheck(T_workcheck t_workcheck) {
        this.t_workcheck = t_workcheck;
    }

    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_workcheck.setT_work_id("1");
        t_workcheck.setT_clock_TimeOne("嘿");
        t_workcheck.setT_clock_TimeTwo("你");
        t_workcheck.setT_clock_TimeThree("叼毛");
        t_workcheck.setT_clock_TimeFour("里");
        t_workcheck.setT_staff_id("1");
        t_workcheck.setT_time(date);
        t_workcheckService.save(t_workcheck);
        return "save";
    }


    public String delete(){
        t_workcheck.setT_work_id("1");
        t_workcheckService.delete(t_workcheck);
        return "delete";
    }

    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_workcheck.setT_work_id("1");
        t_workcheck.setT_clock_TimeOne("改嘿");
        t_workcheck.setT_clock_TimeTwo("改你");
        t_workcheck.setT_clock_TimeThree("改叼毛");
        t_workcheck.setT_clock_TimeFour("改里");
        t_workcheck.setT_staff_id("1");
        t_workcheck.setT_time(date);
        t_workcheckService.update(t_workcheck);
        return "update";
    }


    public String queryAll(){
        List<T_workcheck> list = t_workcheckService.queryAll();
        for(T_workcheck wor : list){
            System.out.println(wor);
        }
        return "queryAll";
    }

}
