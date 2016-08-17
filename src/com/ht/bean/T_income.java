package com.ht.bean;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_income {
    private String t_inc_id;
    private String t_inc_money;
    private String t_inc_cause;
    private String t_inc_balid;
    private String t_inc_time;

    public T_income(String t_inc_id, String t_inc_money, String t_inc_cause, String t_inc_balid, String t_inc_time) {
        this.t_inc_id = t_inc_id;
        this.t_inc_money = t_inc_money;
        this.t_inc_cause = t_inc_cause;
        this.t_inc_balid = t_inc_balid;
        this.t_inc_time = t_inc_time;
    }

    public T_income(){}

    public String getT_inc_id() {
        return t_inc_id;
    }

    public void setT_inc_id(String t_inc_id) {
        this.t_inc_id = t_inc_id;
    }

    public String getT_inc_money() {
        return t_inc_money;
    }

    public void setT_inc_money(String t_inc_money) {
        this.t_inc_money = t_inc_money;
    }

    public String getT_inc_cause() {
        return t_inc_cause;
    }

    public void setT_inc_cause(String t_inc_cause) {
        this.t_inc_cause = t_inc_cause;
    }

    public String getT_inc_balid() {
        return t_inc_balid;
    }

    public void setT_inc_balid(String t_inc_balid) {
        this.t_inc_balid = t_inc_balid;
    }

    public String getT_inc_time() {
        return t_inc_time;
    }

    public void setT_inc_time(String t_inc_time) {
        this.t_inc_time = t_inc_time;
    }
}
