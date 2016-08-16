package com.ht.action;

import com.ht.bean.T_staff;
import com.ht.service.T_staffService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by DengMin on 2016/8/12.
 */
public class T_staffAction extends ActionSupport {

    private T_staffService t_staffService;
    private T_staff t_staff;
    private List<T_staff> sta;

    public List<T_staff> getSta() {
        return sta;
    }

    public void setSta(List<T_staff> sta) {
        this.sta = sta;
    }

    public void setT_staffService(T_staffService t_staffService) {
        this.t_staffService = t_staffService;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }

    public String update(){
        //把页面获取的要插入的数据传递进来
        t_staffService.update(t_staff);
        return "update";
    }

    public String queryall(){
        sta = t_staffService.queryAll();
        t_staffService.close();
        //把list中的数据传递到页面
        return "queryall";
    }

    public String save(){
        //把页面获取的数据传递进来
        t_staffService.save(t_staff);
        return "save";
    }

    public String delete(){
        //把页面获取的要删除的id传递进来
        t_staffService.delete(t_staff);
        return "delete";
    }
}
