package com.ht.bean;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_grade {
    private String t_gr_id;
    private float t_gr_grade;
    private String t_gr_scouid;
    private String t_gr_stuid;
    private String t_gr_claid;
    private String t_gr_time;
    private T_students t_students;

    public String getT_gr_id() {
        return t_gr_id;
    }

    public void setT_gr_id(String t_gr_id) {
        this.t_gr_id = t_gr_id;
    }

    public float getT_gr_grade() {
        return t_gr_grade;
    }

    public void setT_gr_grade(float t_gr_grade) {
        this.t_gr_grade = t_gr_grade;
    }

    public String getT_gr_scouid() {
        return t_gr_scouid;
    }

    public void setT_gr_scouid(String t_gr_scouid) {
        this.t_gr_scouid = t_gr_scouid;
    }

    public String getT_gr_stuid() {
        return t_gr_stuid;
    }

    public void setT_gr_stuid(String t_gr_stuid) {
        this.t_gr_stuid = t_gr_stuid;
    }

    public String getT_gr_claid() {
        return t_gr_claid;
    }

    public void setT_gr_claid(String t_gr_claid) {
        this.t_gr_claid = t_gr_claid;
    }

    public String getT_gr_time() {
        return t_gr_time;
    }

    public void setT_gr_time(String t_gr_time) {
        this.t_gr_time = t_gr_time;
    }

    public T_students getT_students() {
        return t_students;
    }

    public void setT_students(T_students t_students) {
        this.t_students = t_students;
    }

    @Override
    public String toString() {
        return "T_grade{" +
                "t_gr_id='" + t_gr_id + '\'' +
                ", t_gr_grade=" + t_gr_grade +
                ", t_gr_scouid='" + t_gr_scouid + '\'' +
                ", t_gr_stuid='" + t_gr_stuid + '\'' +
                ", t_gr_claid='" + t_gr_claid + '\'' +
                ", t_gr_time='" + t_gr_time + '\'' +
                '}';
    }
}
