package com.ht.bean;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_schedule {
    private String t_sch_id;
    private String t_sch_couid;
    private String t_sch_stuid;
    private String t_sch_content;
    private T_staff t_staff;

    public String getT_sch_id() {
        return t_sch_id;
    }

    public void setT_sch_id(String t_sch_id) {
        this.t_sch_id = t_sch_id;
    }

    public String getT_sch_couid() {
        return t_sch_couid;
    }

    public void setT_sch_couid(String t_sch_couid) {
        this.t_sch_couid = t_sch_couid;
    }

    public String getT_sch_stuid() {
        return t_sch_stuid;
    }

    public void setT_sch_stuid(String t_sch_stuid) {
        this.t_sch_stuid = t_sch_stuid;
    }

    public String getT_sch_content() {
        return t_sch_content;
    }

    public void setT_sch_content(String t_sch_content) {
        this.t_sch_content = t_sch_content;
    }

    public T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }
}
