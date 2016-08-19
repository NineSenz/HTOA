package com.ht.bean;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_education {
    private String t_educate_id;
    private String t_staff_id;
    private String t_StartTime;
    private String t_EndTime;
    private String t_school;
    private String t_education;
    private com.ht.bean.T_staff t_staff;

    public T_education(){}

    public T_education(String t_school, String t_educate_id, String t_staff_id, String t_StartTime, String t_EndTime, String t_education) {
        this.t_school = t_school;
        this.t_educate_id = t_educate_id;
        this.t_staff_id = t_staff_id;
        this.t_StartTime = t_StartTime;
        this.t_EndTime = t_EndTime;
        this.t_education = t_education;
    }

    public String getT_educate_id() {
        return t_educate_id;
    }

    public void setT_educate_id(String t_educate_id) {
        this.t_educate_id = t_educate_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public String getT_StartTime() {
        return t_StartTime;
    }

    public void setT_StartTime(String t_StartTime) {
        this.t_StartTime = t_StartTime;
    }

    public String getT_EndTime() {
        return t_EndTime;
    }

    public void setT_EndTime(String t_EndTime) {
        this.t_EndTime = t_EndTime;
    }

    public String getT_school() {
        return t_school;
    }

    public void setT_school(String t_school) {
        this.t_school = t_school;
    }

    public String getT_education() {
        return t_education;
    }

    public void setT_education(String t_education) {
        this.t_education = t_education;
    }

    public com.ht.bean.T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(com.ht.bean.T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_education{" +
                "t_educate_id='" + t_educate_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_StartTime='" + t_StartTime + '\'' +
                ", t_EndTime='" + t_EndTime + '\'' +
                ", t_school='" + t_school + '\'' +
                ", t_education='" + t_education + '\'' +
                '}';
    }
}
