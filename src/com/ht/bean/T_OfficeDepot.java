package com.ht.bean;
public class T_OfficeDepot {
    private String t_work_id;
    private String t_work_name;
    private String t_work_type;
    private int t_work_count;
    private T_staff t_staff;

    public T_OfficeDepot() {
    }

    public T_OfficeDepot(String t_work_id, String t_work_name, String t_work_type, int t_work_count) {
        this.t_work_id = t_work_id;
        this.t_work_name = t_work_name;
        this.t_work_type = t_work_type;
        this.t_work_count = t_work_count;
    }
    public String getT_work_id() {
        return t_work_id;
    }

    public String getT_work_name() {
        return t_work_name;
    }

    public String getT_work_type() {
        return t_work_type;
    }

    public int getT_work_count() {
        return t_work_count;
    }

    public void setT_work_id(String t_work_id) {
        this.t_work_id = t_work_id;
    }

    public void setT_work_name(String t_work_name) {
        this.t_work_name = t_work_name;
    }

    public void setT_work_type(String t_work_type) {
        this.t_work_type = t_work_type;
    }

    public void setT_work_count(int t_work_count) {
        this.t_work_count = t_work_count;
    }

    public T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_OfficeDepot{" +
                "t_work_id='" + t_work_id + '\'' +
                ", t_work_name='" + t_work_name + '\'' +
                ", t_work_type='" + t_work_type + '\'' +
                ", t_work_count=" + t_work_count +
                '}';
    }
}
