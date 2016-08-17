package com.ht.action;

import com.ht.bean.T_students;
import com.ht.service.T_studentsService;
import com.opensymphony.xwork2.ActionSupport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_studentsAction extends ActionSupport {
    private T_studentsService t_studentsService;
    private T_students t_students;

    public void setT_studentsService(T_studentsService t_studentsService) {
        this.t_studentsService = t_studentsService;
    }

    public void setT_students(T_students t_students) {
        this.t_students = t_students;
    }
    public String add(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_students.setT_stu_id("2");
        t_students.setT_stu_dormid("3");
        t_students.setT_stu_claid("4");
        t_students.setT_stu_name("刘大大");
        t_students.setT_stu_sex("男");
        t_students.setT_stu_age("19");
        t_students.setT_stu_phone("1733");
        t_students.setT_stu_parcall("sdf");
        t_students.setT_stu_parname("as");
        t_students.setT_stu_icard("jk");
        t_students.setT_stu_scholl("fg");
        t_students.setT_stu_birth("h");
        t_students.setT_stu_addr("k");
        t_students.setT_stu_create(date);
        t_students.setT_stu_status("qw");
        t_studentsService.save(t_students);
        return "save";
    }
    public String delete(){
        t_students.setT_stu_id("2");
        t_studentsService.delete(t_students);
        return "delete";
    }
    public String update(){
        t_students.setT_stu_icard("2");
        t_students.setT_stu_name("大哥");
        t_studentsService.update(t_students);
        return "update";
    }
    public String queryAll(){
        List<T_students> list=t_studentsService.queryAll();
        for (T_students stu :list){
            System.out.println(stu);
        }
        return "queryAll";
    }
}
