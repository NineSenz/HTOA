package com.ht.bean;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_course {
    private String t_cou_id;
    private String t_cou_teach;
    private String t_cou_staid;
    private T_staff t_staff;

    public String getT_cou_staid() {
        return t_cou_staid;
    }

    public void setT_cou_staid(String t_cou_staid) {
        this.t_cou_staid = t_cou_staid;
    }

    public String getT_cou_id() {
        return t_cou_id;
    }

    public void setT_cou_id(String t_cou_id) {
        this.t_cou_id = t_cou_id;
    }

    public String getT_cou_teach() {
        return t_cou_teach;
    }

    public void setT_cou_teach(String t_cou_teach) {
        this.t_cou_teach = t_cou_teach;
    }

    public T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }
}
