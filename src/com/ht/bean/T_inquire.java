package com.ht.bean;

public class T_inquire {
    private String t_inq_id;
    private String t_staff_id;
    private String t_inq_name;
    private String t_inq_time;

    public T_inquire() {

    }

    public T_inquire(String t_inq_id, String t_staff_id, String t_inq_name, String t_inq_time) {
        this.t_inq_id = t_inq_id;
        this.t_staff_id = t_staff_id;
        this.t_inq_name = t_inq_name;
        this.t_inq_time = t_inq_time;
    }

    public void setT_inq_id(String t_inq_id) {
        this.t_inq_id = t_inq_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public void setT_inq_name(String t_inq_name) {
        this.t_inq_name = t_inq_name;
    }

    public void setT_inq_time(String t_inq_time) {
        this.t_inq_time = t_inq_time;
    }

    public String getT_inq_id() {
        return t_inq_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public String getT_inq_name() {
        return t_inq_name;
    }

    public String getT_inq_time() {
        return t_inq_time;
    }

    @Override
    public String toString() {
        return "T_inquire{" +
                "t_inq_id='" + t_inq_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_inq_name='" + t_inq_name + '\'' +
                ", t_inq_time='" + t_inq_time + '\'' +
                '}';
    }
}
