package com.ht.bean;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_tickling {
    private String t_tickling_id;
    private String t_staff_id;
    private String t_matter;
    private String t_result;
    private com.ht.bean.T_staff t_staff;

    public T_tickling(){}

    public T_tickling(String t_tickling_id, String t_staff_id, String t_matter, String t_result) {
        this.t_tickling_id = t_tickling_id;
        this.t_staff_id = t_staff_id;
        this.t_matter = t_matter;
        this.t_result = t_result;
    }

    public String getT_tickling_id() {
        return t_tickling_id;
    }

    public void setT_tickling_id(String t_tickling_id) {
        this.t_tickling_id = t_tickling_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public String getT_matter() {
        return t_matter;
    }

    public void setT_matter(String t_matter) {
        this.t_matter = t_matter;
    }

    public String getT_result() {
        return t_result;
    }

    public void setT_result(String t_result) {
        this.t_result = t_result;
    }

    public com.ht.bean.T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(com.ht.bean.T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_tickling{" +
                "t_tickling_id='" + t_tickling_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_matter='" + t_matter + '\'' +
                ", t_result='" + t_result + '\'' +
                '}';
    }
}
