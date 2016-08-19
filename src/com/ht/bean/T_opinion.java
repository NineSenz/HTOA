package com.ht.bean;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_opinion {
    private String t_op_id;
    private String t_op_stuid;
    private String t_op_title;
    private String t_op_content;
    private String t_op_date;
    private T_students t_students;

    public String getT_op_id() {
        return t_op_id;
    }

    public void setT_op_id(String t_op_id) {
        this.t_op_id = t_op_id;
    }

    public String getT_op_stuid() {
        return t_op_stuid;
    }

    public void setT_op_stuid(String t_op_stuid) {
        this.t_op_stuid = t_op_stuid;
    }

    public String getT_op_title() {
        return t_op_title;
    }

    public void setT_op_title(String t_op_title) {
        this.t_op_title = t_op_title;
    }

    public String getT_op_content() {
        return t_op_content;
    }

    public void setT_op_content(String t_op_content) {
        this.t_op_content = t_op_content;
    }

    public String getT_op_date() {
        return t_op_date;
    }

    public void setT_op_date(String t_op_date) {
        this.t_op_date = t_op_date;
    }

    public T_students getT_students() {
        return t_students;
    }

    public void setT_students(T_students t_students) {
        this.t_students = t_students;
    }
}
