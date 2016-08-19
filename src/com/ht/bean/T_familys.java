package com.ht.bean;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_familys {
    private String t_family_id;
    private String t_staff_id;
    private String t_family_name;
    private String t_family_post;
    private String t_relation;
    private String t_contact_phone;
    private T_staff t_staff;

    public T_familys() {
    }

    public T_familys(String t_family_id, String t_staff_id, String t_family_name, String t_family_post, String t_relation, String t_contact_phone) {
        this.t_family_id = t_family_id;
        this.t_staff_id = t_staff_id;
        this.t_family_name = t_family_name;
        this.t_family_post = t_family_post;
        this.t_relation = t_relation;
        this.t_contact_phone = t_contact_phone;
    }

    public void setT_family_id(String t_family_id) {
        this.t_family_id = t_family_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public void setT_family_name(String t_family_name) {
        this.t_family_name = t_family_name;
    }

    public void setT_family_post(String t_family_post) {
        this.t_family_post = t_family_post;
    }

    public void setT_relation(String t_relation) {
        this.t_relation = t_relation;
    }

    public void setT_contact_phone(String t_contact_phone) {
        this.t_contact_phone = t_contact_phone;
    }

    public String getT_family_id() {
        return t_family_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public String getT_family_name() {
        return t_family_name;
    }

    public String getT_family_post() {
        return t_family_post;
    }

    public String getT_relation() {
        return t_relation;
    }

    public String getT_contact_phone() {
        return t_contact_phone;
    }

    public T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_familys{" +
                "t_family_id='" + t_family_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_family_name='" + t_family_name + '\'' +
                ", t_family_post='" + t_family_post + '\'' +
                ", t_relation='" + t_relation + '\'' +
                ", t_contact_phone='" + t_contact_phone + '\'' +
                '}';
    }
}
