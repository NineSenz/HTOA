package com.ht.action;

import com.ht.bean.T_dormitory;
import com.ht.service.T_dormitoryService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_dormitoryAction extends ActionSupport{
    private T_dormitoryService t_dormitoryService;
    private T_dormitory t_dormitory;

    public void setT_dormitoryService(T_dormitoryService t_dormitoryService) {
        this.t_dormitoryService = t_dormitoryService;
    }

    public void setT_dormitory(T_dormitory t_dormitory) {
        this.t_dormitory = t_dormitory;
    }
    public String save(){
        t_dormitory.setT_dorm_id("66");
        t_dormitory.setT_dorm_name("fgh");
        t_dormitory.setT_dorm_aunt("hj");
        t_dormitory.setT_dorm_stuid("99");
        t_dormitoryService.save(t_dormitory);
        return "save";
    }
    public String delete(){
        t_dormitory.setT_dorm_id("66");
        t_dormitoryService.delete(t_dormitory);
        return "delete";
    }
    public String update(){
        t_dormitory.setT_dorm_id("66");
        t_dormitory.setT_dorm_name("sd");
        t_dormitory.setT_dorm_aunt("df");
        t_dormitory.setT_dorm_stuid("3");
        t_dormitoryService.update(t_dormitory);
        return "update";
    }
    public String queryAll(){
        List<T_dormitory> list=t_dormitoryService.queryAll();
        for (T_dormitory t_dormitory:list){
            System.out.println(t_dormitory);
        }
        return "queryAll";
    }
}
