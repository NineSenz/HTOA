package com.ht.bean;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_computer {
    private String t_comp_id;
    private String t_comp_stuid;
    private String t_comp_component;
    private String t_comp_date;

    public T_computer(String t_comp_id, String t_comp_stuid, String t_comp_component, String t_comp_date) {
        this.t_comp_id = t_comp_id;
        this.t_comp_stuid = t_comp_stuid;
        this.t_comp_component = t_comp_component;
        this.t_comp_date = t_comp_date;
    }

    public T_computer() {
    }

    public String getT_comp_id() {
        return t_comp_id;
    }

    public void setT_comp_id(String t_comp_id) {
        this.t_comp_id = t_comp_id;
    }

    public String getT_comp_stuid() {
        return t_comp_stuid;
    }

    public void setT_comp_stuid(String t_comp_stuid) {
        this.t_comp_stuid = t_comp_stuid;
    }

    public String getT_comp_component() {
        return t_comp_component;
    }

    public void setT_comp_component(String t_comp_component) {
        this.t_comp_component = t_comp_component;
    }

    public String getT_comp_date() {
        return t_comp_date;
    }

    public void setT_comp_date(String t_comp_date) {
        this.t_comp_date = t_comp_date;
    }
}
