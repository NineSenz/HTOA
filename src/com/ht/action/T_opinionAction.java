package com.ht.action;

import com.ht.bean.T_opinion;
import com.ht.service.T_opinionService;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_opinionAction {
    private T_opinionService t_opinionService;
    private T_opinion t_opinion;

    public T_opinionService getT_opinionService() {
        return t_opinionService;
    }

    public void setT_opinionService(T_opinionService t_opinionService) {
        this.t_opinionService = t_opinionService;
    }

    public T_opinion getT_opinion() {
        return t_opinion;
    }

    public void setT_opinion(T_opinion t_opinion) {
        this.t_opinion = t_opinion;
    }

    public String save(){
        t_opinionService.save(t_opinion);
        return "save";
    }

    public String delete(){
        t_opinionService.delete(t_opinion);
        return "delete";
    }

    public String update(){
        t_opinionService.update(t_opinion);
        return "update";
    }

    public String queryAll(){
        t_opinionService.queryAll();
        return "queryAll";
    }
}
