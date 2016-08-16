package com.ht.action;

import com.ht.bean.T_wages;
import com.ht.service.T_wagesService;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_wagesAction {
    private T_wagesService t_wagesService;
    private T_wages t_wages;

    public void setT_wagesService(T_wagesService t_wagesService) {
        this.t_wagesService = t_wagesService;
    }

    public void setT_wages(T_wages t_wages) {
        this.t_wages = t_wages;
    }

    public String save(){
        t_wagesService.save(t_wages);
        return "save";
    }

    public String delete(){
        t_wagesService.delete(t_wages);
        return "delete";
    }

    public String update(){
        t_wagesService.update(t_wages);
        return "update";
    }

    public String queryAll(){
        t_wagesService.queryAll();
        return "queryAll";
    }
}
