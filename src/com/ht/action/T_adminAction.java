package com.ht.action;

import com.ht.bean.T_admin;
import com.ht.bean.T_staff;
import com.ht.service.T_adminService;
import com.ht.service.T_staffService;
import com.ht.util.StampUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by please fresh on 2016/8/12.
 */
public class T_adminAction extends ActionSupport {
    private T_adminService t_adminService;
    private T_admin t_admin;
    private String id;
    private T_staff t_staff;
    private T_staffService t_staffService;
    private String gly;

    public String getGly() {
        return gly;
    }

    public void setGly(String gly) {
        this.gly = gly;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }

    public void setT_staffService(T_staffService t_staffService) {
        this.t_staffService = t_staffService;
    }

    public void setT_adminService(T_adminService t_adminService) {
        this.t_adminService = t_adminService;
    }
    public void setT_admin(T_admin t_admin) {
        this.t_admin = t_admin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String save() throws ParseException {
        Date time = Calendar.getInstance().getTime(); //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(time); //把获取到的当前时间转换为设定的格式并用String类型接收
        t_admin.setT_adm_id(StampUtil.dateToStamp(date));
        t_admin.setT_adm_name("猫猫");
        t_admin.setT_adm_email("123@168.com");
        t_admin.setT_adm_pwd("123456");
        t_admin.setT_adm_phone("15970771234");
        t_admin.setT_adm_identity("部门管理");
        t_adminService.save(t_admin);
        return "save";
    }

    public String delete(){
        t_admin.setT_adm_id("1471007639000");
        t_adminService.delete(t_admin);
        return "delete";
    }

    public String update(){
        t_admin = t_adminService.update(t_admin);
        return "update";
    }

    public String query(){
        t_admin = t_adminService.query("123@168.com");
        System.out.println(t_admin);
        return "query";
    }

    public String queryAll(){
        t_adminService.queryAll();
        t_adminService.close();
        return "queryall";
    }

    public String SetManage() throws ParseException { //超级管理员添加普通管理员
        t_staff = t_staffService.query(id);
        t_admin = t_adminService.query(gly+"管理");
        System.out.println("管理"+t_admin.getT_adm_identity());
        t_admin.setT_adm_name(t_staff.getT_sta_name());
        t_admin.setT_adm_email(t_staff.getT_sta_email());
        t_admin.setT_adm_pwd("123456");
        t_admin.setT_adm_phone(t_staff.getT_sta_phone());
        t_adminService.update(t_admin);

        return "query";
    }

}
