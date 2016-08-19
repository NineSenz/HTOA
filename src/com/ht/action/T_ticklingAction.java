package com.ht.action;

import com.ht.bean.T_tickling;
import com.ht.service.T_ticklingService;

import java.util.List;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_ticklingAction {

    private T_tickling t_tickling;
    private T_ticklingService t_ticklingService;

    public void setT_ticklingService(T_ticklingService t_ticklingService) {
        this.t_ticklingService = t_ticklingService;
    }

    public void setT_tickling(T_tickling t_tickling) {
        this.t_tickling = t_tickling;
    }

    public String save(){
        t_tickling.setT_tickling_id("1");
        t_tickling.setT_staff_id("1");
        t_tickling.setT_matter("可以");
        t_tickling.setT_result("可以啊");
        t_ticklingService.save(t_tickling);
        return "save";
    }

    public String delete(){
        t_tickling.setT_tickling_id("1");
        t_ticklingService.delete(t_tickling);
        return "delete";
    }

    public String update(){
        t_tickling.setT_tickling_id("1");
        t_tickling.setT_staff_id("改1");
        t_tickling.setT_matter("改可以");
        t_tickling.setT_result("改可以啊");
        t_ticklingService.update(t_tickling);
        return "update";
    }


    public String queryAll(){
        List<T_tickling> list = t_ticklingService.queryAll();
        for(T_tickling tic : list){
            System.out.println(tic);
        }
        return "queryAll";
    }




}
