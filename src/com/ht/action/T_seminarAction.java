package com.ht.action;

import com.ht.bean.T_seminar;
import com.ht.service.T_seminarService;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_seminarAction {
    private T_seminarService t_seminarService;
    private T_seminar t_seminar;

    public void setT_seminarService(T_seminarService t_seminarService) {
        this.t_seminarService = t_seminarService;
    }

    public void setT_seminar(T_seminar t_seminar) {
        this.t_seminar = t_seminar;
    }

    public String save(){
        t_seminarService.save(t_seminar);
        return "save";
    }

    public String delete(){
        t_seminarService.delete(t_seminar);
        return "delete";
    }

    public String update(){
        t_seminarService.update(t_seminar);
        return "update";
    }

    public String queryAll(){
        t_seminarService.queryAll();
        return "queryAll";
    }
}
