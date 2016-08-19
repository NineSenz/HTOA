package com.ht.action;

import com.ht.bean.T_workcheckunusual;
import com.ht.service.T_workcheckunusualService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_workcheckunusualAction extends ActionSupport {
    private T_workcheckunusualService t_workcheckunusualService;
    private T_workcheckunusual t_workcheckunusual;

    public void setT_workcheckunusualService(T_workcheckunusualService t_workcheckunusualService) {
        this.t_workcheckunusualService = t_workcheckunusualService;
    }

    public void setT_workcheckunusual(T_workcheckunusual t_workcheckunusual) {
        this.t_workcheckunusual = t_workcheckunusual;
    }
    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_workcheckunusual.setT_unusual_id("99");
        t_workcheckunusual.setT_work_id("55");
        t_workcheckunusual.setT_StateTime(date);
        t_workcheckunusual.setT_reason("gfh");
        t_workcheckunusualService.save(t_workcheckunusual);
        return "save";
    }
    public String delete(){
        t_workcheckunusual.setT_unusual_id("99");
        t_workcheckunusualService.delete(t_workcheckunusual);
        return "delete";
    }
    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_workcheckunusual.setT_unusual_id("99");
        t_workcheckunusual.setT_work_id("88");
        t_workcheckunusual.setT_StateTime(date);
        t_workcheckunusual.setT_reason("sd");
        t_workcheckunusualService.update(t_workcheckunusual);
        return "update";
    }
    public String queryAll(){
        List<T_workcheckunusual> list=t_workcheckunusualService.queryAll();
        for (T_workcheckunusual t_workcheckunusual:list){
            System.out.println(t_workcheckunusual);
        }
        return "queryAll";
    }
}
