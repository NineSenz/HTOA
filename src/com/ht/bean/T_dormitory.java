package com.ht.bean;

import java.util.Set;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_dormitory {
    private String t_dorm_id;
    private String t_dorm_name;
    private String t_dorm_aunt;
    private String t_dorm_stuid;
    private Set<com.ht.bean.T_students> t_students;

    public T_dormitory() {}

    public T_dormitory(String t_dorm_id, String t_dorm_name, String t_dorm_aunt, String t_dorm_stuid) {
        this.t_dorm_id = t_dorm_id;
        this.t_dorm_name = t_dorm_name;
        this.t_dorm_aunt = t_dorm_aunt;
        this.t_dorm_stuid = t_dorm_stuid;
    }

    public void setT_dorm_id(String t_dorm_id) {
        this.t_dorm_id = t_dorm_id;
    }

    public void setT_dorm_name(String t_dorm_name) {
        this.t_dorm_name = t_dorm_name;
    }

    public void setT_dorm_aunt(String t_dorm_aunt) {
        this.t_dorm_aunt = t_dorm_aunt;
    }

    public void setT_dorm_stuid(String t_dorm_stuid) {
        this.t_dorm_stuid = t_dorm_stuid;
    }

    public String getT_dorm_id() {
        return t_dorm_id;
    }

    public String getT_dorm_name() {
        return t_dorm_name;
    }

    public String getT_dorm_aunt() {
        return t_dorm_aunt;
    }

    public String getT_dorm_stuid() {
        return t_dorm_stuid;
    }

    public Set<com.ht.bean.T_students> getT_students() {
        return t_students;
    }

    public void setT_students(Set<com.ht.bean.T_students> t_students) {
        this.t_students = t_students;
    }

    @Override
    public String toString() {
        return "T_dormitory{" +
                "t_dorm_id='" + t_dorm_id + '\'' +
                ", t_dorm_name='" + t_dorm_name + '\'' +
                ", t_dorm_aunt='" + t_dorm_aunt + '\'' +
                ", t_dorm_stuid='" + t_dorm_stuid + '\'' +
                '}';
    }
}
