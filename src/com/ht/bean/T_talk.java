package com.ht.bean;

/**
 * Created by Tom on 2016/8/16.
 */
public class T_talk {
    private String t_talk_id;
    private String t_talk_title;
    private String t_talk_details;
    private String t_talk_staid;
    private String t_talk_stuid;
    private String t_talk_time;
    private String t_talk_number;

    public T_talk(){}

    public T_talk(String t_talk_id, String t_talk_number, String t_talk_title, String t_talk_details, String t_talk_staid, String t_talk_stuid, String t_talk_time) {
        this.t_talk_id = t_talk_id;
        this.t_talk_number = t_talk_number;
        this.t_talk_title = t_talk_title;
        this.t_talk_details = t_talk_details;
        this.t_talk_staid = t_talk_staid;
        this.t_talk_stuid = t_talk_stuid;
        this.t_talk_time = t_talk_time;
    }

    public String getT_talk_id() {
        return t_talk_id;
    }

    public void setT_talk_id(String t_talk_id) {
        this.t_talk_id = t_talk_id;
    }

    public String getT_talk_title() {
        return t_talk_title;
    }

    public void setT_talk_title(String t_talk_title) {
        this.t_talk_title = t_talk_title;
    }

    public String getT_talk_details() {
        return t_talk_details;
    }

    public void setT_talk_details(String t_talk_details) {
        this.t_talk_details = t_talk_details;
    }

    public String getT_talk_staid() {
        return t_talk_staid;
    }

    public void setT_talk_staid(String t_talk_staid) {
        this.t_talk_staid = t_talk_staid;
    }

    public String getT_talk_stuid() {
        return t_talk_stuid;
    }

    public void setT_talk_stuid(String t_talk_stuid) {
        this.t_talk_stuid = t_talk_stuid;
    }

    public String getT_talk_time() {
        return t_talk_time;
    }

    public void setT_talk_time(String t_talk_time) {
        this.t_talk_time = t_talk_time;
    }

    public String getT_talk_number() {
        return t_talk_number;
    }

    public void setT_talk_number(String t_talk_number) {
        this.t_talk_number = t_talk_number;
    }

    @Override
    public String toString() {
        return "T_talk{" +
                "t_talk_id='" + t_talk_id + '\'' +
                ", t_talk_title='" + t_talk_title + '\'' +
                ", t_talk_details='" + t_talk_details + '\'' +
                ", t_talk_staid='" + t_talk_staid + '\'' +
                ", t_talk_stuid='" + t_talk_stuid + '\'' +
                ", t_talk_time='" + t_talk_time + '\'' +
                ", t_talk_number='" + t_talk_number + '\'' +
                '}';
    }
}
