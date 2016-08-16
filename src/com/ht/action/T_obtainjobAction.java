package com.ht.action;

import com.ht.bean.T_obtainjob;
import com.ht.service.T_obtainjobService;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_obtainjobAction {
    private T_obtainjobService t_obtainjobService;
    private T_obtainjob t_obtainjob;

    public void setT_obtainjobService(T_obtainjobService t_obtainjobService) {
        this.t_obtainjobService = t_obtainjobService;
    }

    public void setT_obtainjob(T_obtainjob t_obtainjob) {
        this.t_obtainjob = t_obtainjob;
    }

    public String save(){
        t_obtainjob.setT_obt_id("1");
        t_obtainjob.setT_obt_comanyname("科技");
        t_obtainjob.setT_obt_stuid("k");
        t_obtainjob.setT_obt_salary("7000");
        t_obtainjob.setT_obt_describe("工程师");
        t_obtainjob.setT_obt_date("1月");
        t_obtainjobService.save(t_obtainjob);
        return "save";
    }

    public String update(){
        t_obtainjobService.update(t_obtainjob);
        return"update";
    }

    public String query(){
        t_obtainjobService.query("p");
        return "query";
    }

    public String delete(){
        t_obtainjobService.delete(t_obtainjob);
        return "delete";
    }
    public String querAll(){
        t_obtainjobService.queryAll();
        return "queryAll";
    }
}
