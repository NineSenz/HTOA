package com.ht.action;

import com.ht.bean.T_dormitory;
import com.ht.bean.T_familys;
import com.ht.service.T_familysService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_familysAction extends ActionSupport{
    private T_familysService t_familysService;
    private T_familys t_familys;

    public void setT_familysService(T_familysService t_familysService) {
        this.t_familysService = t_familysService;
    }

    public void setT_familys(T_familys t_familys) {
        this.t_familys = t_familys;
    }
    public String save(){
        t_familys.setT_family_id("5");
        t_familys.setT_staff_id("6");
        t_familys.setT_family_name("df");
        t_familys.setT_family_post("bn");
        t_familys.setT_relation("gh");
        t_familys.setT_contact_phone("7899966");
        t_familysService.save(t_familys);
        return "save";
    }
    public String delete(){
        t_familys.setT_family_id("5");
        t_familysService.delete(t_familys);
        return "delete";
    }
    public String update(){
        t_familys.setT_family_id("5");
        t_familys.setT_staff_id("9");
        t_familys.setT_family_name("sdv");
        t_familys.setT_family_post("xcv");
        t_familys.setT_relation("xcv");
        t_familys.setT_contact_phone("173");
        t_familysService.update(t_familys);
        return "update";
    }
    public String queryAll(){
        List<T_familys> list=t_familysService.queryAll();
        for (T_familys t_familys:list){
            System.out.println(t_familys);
        }
        return "queryAll";
    }

}
