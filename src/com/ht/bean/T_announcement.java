package com.ht.bean;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_announcement {
    private String t_ac_id;
    private String t_ac_title;
    private String t_ac_content;
    private String t_ac_admid;
    private int t_ac_status;
    private String t_ac_address;
    private T_admin t_admin;

    public String getT_ac_id() {
        return t_ac_id;
    }

    public void setT_ac_id(String t_ac_id) {
        this.t_ac_id = t_ac_id;
    }

    public String getT_ac_title() {
        return t_ac_title;
    }

    public void setT_ac_title(String t_ac_title) {
        this.t_ac_title = t_ac_title;
    }

    public String getT_ac_content() {
        return t_ac_content;
    }

    public void setT_ac_content(String t_ac_content) {
        this.t_ac_content = t_ac_content;
    }

    public String getT_ac_admid() {
        return t_ac_admid;
    }

    public void setT_ac_admid(String t_ac_admid) {
        this.t_ac_admid = t_ac_admid;
    }

    public int getT_ac_status() {
        return t_ac_status;
    }

    public void setT_ac_status(int t_ac_status) {
        this.t_ac_status = t_ac_status;
    }

    public String getT_ac_address() {
        return t_ac_address;
    }

    public void setT_ac_address(String t_ac_address) {
        this.t_ac_address = t_ac_address;
    }

    public T_admin getT_admin() {
        return t_admin;
    }

    public void setT_admin(T_admin t_admin) {
        this.t_admin = t_admin;
    }
}
