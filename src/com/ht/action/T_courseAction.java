package com.ht.action;

import com.ht.bean.T_course;
import com.ht.service.T_courseService;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_courseAction {
    private T_courseService t_courseService;
    private T_course t_course;

    public void setT_courseService(T_courseService t_courseService) {
        this.t_courseService = t_courseService;
    }

    public void setT_course(T_course t_course) {
        this.t_course = t_course;
    }

    public String save(){
        t_courseService.save(t_course);
        return "save";
    }

    public String delete(){
        t_courseService.delete(t_course);
        return "delete";
    }

    public String update(){
        t_courseService.update(t_course);
        return "update";
    }

    public String queryAll(){
        t_courseService.queryAll();
        return "queryAll";
    }
}
