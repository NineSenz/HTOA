package com.ht.bean;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_beonduty {
    private String t_beonduty_id;
    private String t_staff_id;
    private String t_BeondutyTime;
    private String t_scope;
    private String t_record;
    private com.ht.bean.T_staff t_staff;

    public T_beonduty(){}

    public T_beonduty(String t_beonduty_id, String t_record, String t_scope, String t_BeondutyTime, String t_staff_id) {
        this.t_beonduty_id = t_beonduty_id;
        this.t_record = t_record;
        this.t_scope = t_scope;
        this.t_BeondutyTime = t_BeondutyTime;
        this.t_staff_id = t_staff_id;
    }

    public String getT_beonduty_id() {
        return t_beonduty_id;
    }

    public void setT_beonduty_id(String t_beonduty_id) {
        this.t_beonduty_id = t_beonduty_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public String getT_BeondutyTime() {
        return t_BeondutyTime;
    }

    public void setT_BeondutyTime(String t_BeondutyTime) {
        this.t_BeondutyTime = t_BeondutyTime;
    }

    public String getT_scope() {
        return t_scope;
    }

    public void setT_scope(String t_scope) {
        this.t_scope = t_scope;
    }

    public String getT_record() {
        return t_record;
    }

    public void setT_record(String t_record) {
        this.t_record = t_record;
    }

    public com.ht.bean.T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(com.ht.bean.T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_beonduty{" +
                "t_beonduty_id='" + t_beonduty_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_BeondutyTime='" + t_BeondutyTime + '\'' +
                ", t_scope='" + t_scope + '\'' +
                ", t_record='" + t_record + '\'' +
                '}';
    }
}
