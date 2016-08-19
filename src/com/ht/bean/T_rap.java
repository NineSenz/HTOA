package com.ht.bean;


public class T_rap {
    private String t_rap_id;
    private String t_rap_title;
    private String t_rap_datails;
    private String t_rap_stuid;
    private String t_rap_time;
    private int t_rap_status;
    private T_students t_students;

    public T_rap() {
    }

    public T_rap(String t_rap_id, String t_rap_title, String t_rap_datails, String t_rap_stuid, String t_rap_time, int t_rap_status) {
        this.t_rap_id = t_rap_id;
        this.t_rap_title = t_rap_title;
        this.t_rap_datails = t_rap_datails;
        this.t_rap_stuid = t_rap_stuid;
        this.t_rap_time = t_rap_time;
        this.t_rap_status = t_rap_status;
    }

    public void setT_rap_id(String t_rap_id) {
        this.t_rap_id = t_rap_id;
    }

    public void setT_rap_title(String t_rap_title) {
        this.t_rap_title = t_rap_title;
    }

    public void setT_rap_datails(String t_rap_datails) {
        this.t_rap_datails = t_rap_datails;
    }

    public void setT_rap_stuid(String t_rap_stuid) {
        this.t_rap_stuid = t_rap_stuid;
    }

    public void setT_rap_time(String t_rap_time) {
        this.t_rap_time = t_rap_time;
    }

    public void setT_rap_status(int t_rap_status) {
        this.t_rap_status = t_rap_status;
    }

    public String getT_rap_id() {
        return t_rap_id;
    }

    public String getT_rap_title() {
        return t_rap_title;
    }

    public String getT_rap_datails() {
        return t_rap_datails;
    }

    public String getT_rap_stuid() {
        return t_rap_stuid;
    }

    public String getT_rap_time() {
        return t_rap_time;
    }

    public int getT_rap_status() {
        return t_rap_status;
    }

    public T_students getT_students() {
        return t_students;
    }

    public void setT_students(T_students t_students) {
        this.t_students = t_students;
    }

    @Override
    public String toString() {
        return "T_rap{" +
                "t_rap_id='" + t_rap_id + '\'' +
                ", t_rap_title='" + t_rap_title + '\'' +
                ", t_rap_datails='" + t_rap_datails + '\'' +
                ", t_rap_stuid='" + t_rap_stuid + '\'' +
                ", t_rap_time='" + t_rap_time + '\'' +
                ", t_rap_status=" + t_rap_status +
                '}';
    }
}
