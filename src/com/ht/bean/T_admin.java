package com.ht.bean;

/**
 * Created by please fresh on 2016/8/12.
 */
public class T_admin {
    private String t_adm_id;
    private String t_adm_name;
    private String t_adm_email;
    private String t_adm_pwd;
    private String t_adm_phone;
    private String t_adm_identity;

    public String getT_adm_id() {
        return t_adm_id;
    }

    public void setT_adm_id(String t_adm_id) {
        this.t_adm_id = t_adm_id;
    }

    public String getT_adm_name() {
        return t_adm_name;
    }

    public void setT_adm_name(String t_adm_name) {
        this.t_adm_name = t_adm_name;
    }

    public String getT_adm_email() {
        return t_adm_email;
    }

    public void setT_adm_email(String t_adm_email) {
        this.t_adm_email = t_adm_email;
    }

    public String getT_adm_pwd() {
        return t_adm_pwd;
    }

    public void setT_adm_pwd(String t_adm_pwd) {
        this.t_adm_pwd = t_adm_pwd;
    }

    public String getT_adm_phone() {
        return t_adm_phone;
    }

    public void setT_adm_phone(String t_adm_phone) {
        this.t_adm_phone = t_adm_phone;
    }

    public String getT_adm_identity() {
        return t_adm_identity;
    }

    public void setT_adm_identity(String t_adm_identity) {
        this.t_adm_identity = t_adm_identity;
    }

    @Override
    public String toString() {
        return "T_admin{" +
                "t_adm_id='" + t_adm_id + '\'' +
                ", t_adm_name='" + t_adm_name + '\'' +
                ", t_adm_email='" + t_adm_email + '\'' +
                ", t_adm_pwd='" + t_adm_pwd + '\'' +
                ", t_adm_phone='" + t_adm_phone + '\'' +
                ", t_adm_identity='" + t_adm_identity + '\'' +
                '}';
    }
}
