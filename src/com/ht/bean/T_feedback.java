package com.ht.bean;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_feedback {
    private String t_fb_id;
    private String t_fb_staid;
    private String t_fb_question;
    private String t_fb_answer;
    private T_staff t_staff;

    public String getT_fb_id() {
        return t_fb_id;
    }

    public void setT_fb_id(String t_fb_id) {
        this.t_fb_id = t_fb_id;
    }

    public String getT_fb_staid() {
        return t_fb_staid;
    }

    public void setT_fb_staid(String t_fb_staid) {
        this.t_fb_staid = t_fb_staid;
    }

    public String getT_fb_question() {
        return t_fb_question;
    }

    public void setT_fb_question(String t_fb_question) {
        this.t_fb_question = t_fb_question;
    }

    public String getT_fb_answer() {
        return t_fb_answer;
    }

    public void setT_fb_answer(String t_fb_answer) {
        this.t_fb_answer = t_fb_answer;
    }

    public T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }
}
