package com.ht.action;

import com.ht.bean.T_department;
import com.ht.bean.T_staff;
import com.ht.service.T_departmentService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by liujie on 2016/8/12.
 */
public class T_departmentAction extends ActionSupport {
    private T_departmentService t_departmentService;
    private T_department t_department;

    public void setT_department(T_department t_department) {
        this.t_department = t_department;
    }

    public void setT_departmentService(T_departmentService t_departmentService) {
        this.t_departmentService = t_departmentService;
    }

    public String add(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        //把页面数据传递进来
        t_departmentService.save(t_department);
        return "add";
    }
    public String delete(){
        //把页面数据传递进来
        t_departmentService.delete(t_department);
        return "delete";
    }
    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        //把页面数据传递进来
        t_departmentService.update(t_department);
        return "update";
    }
    public String queryAll(){
        List<T_department> list = t_departmentService.queryAll();
         for(T_department dep:list){
            System.out.println("部门名称："+dep.getT_dep_name());
            /*Set<T_staff> ssta = dep.getT_staffs();
            Iterator<T_staff> ite = ssta.iterator();
            while (ite.hasNext()) {
                T_staff tsta = ite.next();
                System.out.println("部门员工姓名："+tsta.getT_sta_name());
            }*/
        }
        t_departmentService.close();
        return "queryall";
    }
}
