package com.ht.bean;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_reply {
    private String t_rep_id;
    private String t_rep_name;
    private String t_rep_staid;
    private String t_rep_stuid;
    private float t_rep_score;
    private String t_rep_date;

    public String getT_rep_id() {
        return t_rep_id;
    }

    public void setT_rep_id(String t_rep_id) {
        this.t_rep_id = t_rep_id;
    }

    public String getT_rep_name() {
        return t_rep_name;
    }

    public void setT_rep_name(String t_rep_name) {
        this.t_rep_name = t_rep_name;
    }

    public String getT_rep_staid() {
        return t_rep_staid;
    }

    public void setT_rep_staid(String t_rep_staid) {
        this.t_rep_staid = t_rep_staid;
    }

    public String getT_rep_stuid() {
        return t_rep_stuid;
    }

    public void setT_rep_stuid(String t_rep_stuid) {
        this.t_rep_stuid = t_rep_stuid;
    }

    public float getT_rep_score() {
        return t_rep_score;
    }

    public void setT_rep_score(float t_rep_score) {
        this.t_rep_score = t_rep_score;
    }

    public String getT_rep_date() {
        return t_rep_date;
    }

    public void setT_rep_date(String t_rep_date) {
        this.t_rep_date = t_rep_date;
    }

    @Override
    public String toString() {
        return "T_reply{" +
                "t_rep_id='" + t_rep_id + '\'' +
                ", t_rep_name='" + t_rep_name + '\'' +
                ", t_rep_staid='" + t_rep_staid + '\'' +
                ", t_rep_stuid='" + t_rep_stuid + '\'' +
                ", t_rep_score=" + t_rep_score +
                ", t_rep_date='" + t_rep_date + '\'' +
                '}';
    }
}
