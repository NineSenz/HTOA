package com.ht.action;

import com.ht.bean.T_admin;
import com.ht.bean.T_staff;
import com.ht.service.T_adminService;
import com.ht.service.T_staffService;
import com.ht.util.Pager;
import com.ht.util.StampUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by please fresh on 2016/8/12.
 */
public class T_adminAction extends ActionSupport {
    private T_adminService t_adminService;
    private T_admin t_admin;
    private List<T_admin> admins;
    private String email;
    private T_staff t_staff;
    private T_staffService t_staffService;
    private String gly;


    private List<T_admin> rows;  //只需get()
    private int total; //只需get()
    private Pager<T_admin> pager; //不用get()和set()
    private String id; //只需set();

    public List<T_admin> getRows() {
        return rows;
    }

    public int getTotal() {
        return total;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public List<T_admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<T_admin> admins) {
        this.admins = admins;
    }

    public void setT_adminService(T_adminService t_adminService) {
        this.t_adminService = t_adminService;
    }

    public T_admin getT_admin() {
        return t_admin;
    }

    public void setT_admin(T_admin t_admin) {
        this.t_admin = t_admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String save() throws ParseException {
        System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[");
        System.out.println(t_admin);
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
        admins = t_adminService.queryAll();
        t_adminService.close();
        return "queryall";
    }

    public String queryEmailPwd(){
        t_staff = t_staffService.query(email);
        return "yes";
    }

    public String SetManage() throws ParseException { //超级管理员添加普通管理员
        t_staff = t_staffService.query(email);
        t_admin = t_adminService.query(gly+"管理");
        System.out.println("管理"+t_admin.getT_adm_identity());
        t_admin.setT_adm_name(t_staff.getT_sta_name());
        //t_admin.setT_adm_email(t_staff.getT_sta_email());
        t_admin.setT_adm_pwd("123456");
        t_admin.setT_adm_phone(t_staff.getT_sta_phone());
        t_adminService.update(t_admin);
        return "query";
    }

    public String queryByPager() throws IOException {
        HttpServletRequest req = ServletActionContext.getRequest();

        int page = Integer.valueOf(req.getParameter("page"));
        int pageSize = Integer.valueOf(req.getParameter("rows"));

        pager = new Pager<T_admin>();
        pager = t_adminService.pagerList(pager);
        pager.setPageNo(page);
        pager.setPageSize(pageSize);

        rows = pager.getRows();
        total = pager.getTotal();
        return "success";
    }

}
