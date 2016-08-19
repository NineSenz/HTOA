package com.ht.bean;


import java.util.Set;

public class T_department {
    private String t_dep_id;
    private String t_dep_admid;
    private String t_dep_name;
    private int t_dep_status;
    private String t_dep_createtime;
    private Set<T_staff> t_staffs;
    private T_admin t_admin;

    public  T_department(){};

    public void setT_dep_id(String t_dep_id) {
        this.t_dep_id = t_dep_id;
    }

    public void setT_dep_admid(String t_dep_admid) {
        this.t_dep_admid = t_dep_admid;
    }

    public void setT_dep_name(String t_dep_name) {
        this.t_dep_name = t_dep_name;
    }

    public void setT_dep_status(int t_dep_status) {
        this.t_dep_status = t_dep_status;
    }

    public void setT_dep_createtime(String t_dep_createtime) {
        this.t_dep_createtime = t_dep_createtime;
    }

    public String getT_dep_id() {
        return t_dep_id;
    }

    public String getT_dep_admid() {
        return t_dep_admid;
    }

    public String getT_dep_name() {
        return t_dep_name;
    }

    public int getT_dep_status() {
        return t_dep_status;
    }

    public String getT_dep_createtime() {
        return t_dep_createtime;
    }

    public Set<T_staff> getT_staffs() {
        return t_staffs;
    }

    public void setT_staffs(Set<T_staff> t_staffs) {
        this.t_staffs = t_staffs;
    }

    public T_admin getT_admin() {
        return t_admin;
    }

    public void setT_admin(T_admin t_admin) {
        this.t_admin = t_admin;
    }

    @Override
    public String toString() {
        return "T_department{" +
                "t_dep_id='" + t_dep_id + '\'' +
                ", t_dep_admid='" + t_dep_admid + '\'' +
                ", t_dep_name='" + t_dep_name + '\'' +
                ", t_dep_status=" + t_dep_status +
                ", t_dep_createtime='" + t_dep_createtime + '\'' +
                '}';
    }
}