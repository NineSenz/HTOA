package com.ht.action;

import com.ht.bean.T_schedule;
import com.ht.service.T_scheduleService;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_scheduleAction {
    private T_scheduleService t_scheduleService;
    private T_schedule t_schedule;

    public void setT_scheduleService(T_scheduleService t_scheduleService) {
        this.t_scheduleService = t_scheduleService;
    }

    public void setT_schedule(T_schedule t_schedule) {
        this.t_schedule = t_schedule;
    }

    public String save(){
        t_scheduleService.save(t_schedule);
        return "save";
    };
    public String delete(){
        t_scheduleService.delete(t_schedule);
        return "delete";
    };
    public String update(){
        t_scheduleService.update(t_schedule);
        return "update";
    };
    public String queryAll(){
        t_scheduleService.queryAll();
        return "queryAll";
    };
}
