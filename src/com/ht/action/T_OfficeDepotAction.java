package com.ht.action;

import com.ht.bean.T_OfficeDepot;
import com.ht.bean.T_department;
import com.ht.service.T_OfficeDepotService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by liujie on 2016/8/13.
 */
public class T_OfficeDepotAction extends ActionSupport{
    private T_OfficeDepotService t_officeDepotService;
    private T_OfficeDepot t_officeDepot;

    public void setT_officeDepotService(T_OfficeDepotService t_officeDepotService) {
        this.t_officeDepotService = t_officeDepotService;
    }

    public void setT_officeDepot(T_OfficeDepot t_officeDepot) {
        this.t_officeDepot = t_officeDepot;
    }

    public String add(){
        t_officeDepot.setT_work_id("165");
        t_officeDepot.setT_work_name("是否");
        t_officeDepot.setT_work_type("篮球");
        t_officeDepot.setT_work_count(22);
        t_officeDepotService.save(t_officeDepot);
        return "save";
    }

    public String delete(){
        t_officeDepot.setT_work_id("165");
        t_officeDepotService.delete(t_officeDepot);
        return "delete";
    }
    public String update(){
        t_officeDepot.setT_work_id("165");
        t_officeDepot.setT_work_name("sdf");
        t_officeDepot.setT_work_type("sd");
        t_officeDepot.setT_work_count(19);
        t_officeDepotService.update(t_officeDepot);
        return "update";
    }
    public  String queryAll(){
        List<T_OfficeDepot> list = t_officeDepotService.queryAll();
        for(T_OfficeDepot t:list){
            System.out.println(t);
        }
        return "queryAll";
    }
}
