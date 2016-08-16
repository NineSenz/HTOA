package com.ht.action;

import com.ht.bean.T_expend;
import com.ht.service.T_expendService;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_expendAction {
    private T_expendService t_expendService;
    private T_expend t_expend;

    public void setT_expendService(T_expendService t_expendService) {
        this.t_expendService = t_expendService;
    }

    public void setT_expend(T_expend t_expend) {
        this.t_expend = t_expend;
    }

    public String save(){
        t_expendService.save(t_expend);
        return "save";
    }
    public String delete(){
        t_expendService.delete(t_expend);
        return "delete";
    }
    public String update(){
        t_expendService.update(t_expend);
        return "update";
    }
    public String queryAll(){
        t_expendService.queryAll();
        return "queryAll";
    }

}
