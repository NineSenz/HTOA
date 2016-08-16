package com.ht.bean;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_obtainjob {

    private String t_obt_id;
    private String t_obt_comanyname;
    private String t_obt_stuid;
    private String t_obt_salary;
    private String t_obt_describe;
    private String t_obt_date;

    public T_obtainjob() {
    }

    public String getT_obt_id() {
        return t_obt_id;
    }

    public void setT_obt_id(String t_obt_id) {
        this.t_obt_id = t_obt_id;
    }

    public String getT_obt_comanyname() {
        return t_obt_comanyname;
    }

    public void setT_obt_comanyname(String t_obt_comanyname) {
        this.t_obt_comanyname = t_obt_comanyname;
    }

    public String getT_obt_stuid() {
        return t_obt_stuid;
    }

    public void setT_obt_stuid(String t_obt_stuid) {
        this.t_obt_stuid = t_obt_stuid;
    }

    public String getT_obt_salary() {
        return t_obt_salary;
    }

    public void setT_obt_salary(String t_obt_salary) {
        this.t_obt_salary = t_obt_salary;
    }

    public String getT_obt_describe() {
        return t_obt_describe;
    }

    public void setT_obt_describe(String t_obt_describe) {
        this.t_obt_describe = t_obt_describe;
    }

    public String getT_obt_date() {
        return t_obt_date;
    }

    public void setT_obt_date(String t_obt_date) {
        this.t_obt_date = t_obt_date;
    }

    @Override
    public String toString() {
        return "T_obtainjob{" +
                "t_obt_id='" + t_obt_id + '\'' +
                ", t_obt_comanyname='" + t_obt_comanyname + '\'' +
                ", t_obt_stuid='" + t_obt_stuid + '\'' +
                ", t_obt_salary='" + t_obt_salary + '\'' +
                ", t_obt_describe='" + t_obt_describe + '\'' +
                ", t_obt_date='" + t_obt_date + '\'' +
                '}';
    }
}
