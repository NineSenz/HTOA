package com.ht.bean;

/**
 * Created by liujie on 2016/8/16.
 */
public class T_class {
    private String t_cla_id;
    private String t_cla_name;
    private String t_cla_num;
    private String t_cla_teach;
    private String t_cla_coach;
    private String t_cla_claadm;
    private String t_cla_adds;
    private String t_cla_create;

    public T_class() {
    }

    public T_class(String t_cla_id, String t_cla_name, String t_cla_num, String t_cla_teach, String t_cla_coach, String t_cla_claadm, String t_cla_adds, String t_cla_create) {
        this.t_cla_id = t_cla_id;
        this.t_cla_name = t_cla_name;
        this.t_cla_num = t_cla_num;
        this.t_cla_teach = t_cla_teach;
        this.t_cla_coach = t_cla_coach;
        this.t_cla_claadm = t_cla_claadm;
        this.t_cla_adds = t_cla_adds;
        this.t_cla_create = t_cla_create;
    }

    public void setT_cla_id(String t_cla_id) {
        this.t_cla_id = t_cla_id;
    }

    public void setT_cla_name(String t_cla_name) {
        this.t_cla_name = t_cla_name;
    }

    public void setT_cla_num(String t_cla_num) {
        this.t_cla_num = t_cla_num;
    }

    public void setT_cla_teach(String t_cla_teach) {
        this.t_cla_teach = t_cla_teach;
    }

    public void setT_cla_coach(String t_cla_coach) {
        this.t_cla_coach = t_cla_coach;
    }

    public void setT_cla_claadm(String t_cla_claadm) {
        this.t_cla_claadm = t_cla_claadm;
    }

    public void setT_cla_adds(String t_cla_adds) {
        this.t_cla_adds = t_cla_adds;
    }

    public void setT_cla_create(String t_cla_create) {
        this.t_cla_create = t_cla_create;
    }

    public String getT_cla_id() {
        return t_cla_id;
    }

    public String getT_cla_name() {
        return t_cla_name;
    }

    public String getT_cla_num() {
        return t_cla_num;
    }

    public String getT_cla_teach() {
        return t_cla_teach;
    }

    public String getT_cla_coach() {
        return t_cla_coach;
    }

    public String getT_cla_claadm() {
        return t_cla_claadm;
    }

    public String getT_cla_adds() {
        return t_cla_adds;
    }

    public String getT_cla_create() {
        return t_cla_create;
    }

    @Override
    public String toString() {
        return "T_class{" +
                "t_cla_id='" + t_cla_id + '\'' +
                ", t_cla_name='" + t_cla_name + '\'' +
                ", t_cla_num='" + t_cla_num + '\'' +
                ", t_cla_teach='" + t_cla_teach + '\'' +
                ", t_cla_coach='" + t_cla_coach + '\'' +
                ", t_cla_claadm='" + t_cla_claadm + '\'' +
                ", t_cla_adds='" + t_cla_adds + '\'' +
                ", t_cla_create='" + t_cla_create + '\'' +
                '}';
    }
}
