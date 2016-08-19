package com.ht.bean;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_journal {
    private String t_log_id;
    private String t_staff_id;
    private String t_date;
    private String t_WeekSeven;
    private String t_WeekOne;
    private String t_WeekTwo;
    private String t_WeekThree;
    private String t_WeekFour;
    private String t_WeekFive;
    private String t_WeekSix;
    private String t_summary;
    private com.ht.bean.T_staff t_staff;

    public T_journal() {
    }

    public T_journal(String t_log_id, String t_staff_id, String t_date, String t_WeekSeven, String t_WeekOne, String t_WeekTwo, String t_WeekThree, String t_WeekFour, String t_WeekFive, String t_WeekSix, String t_summary) {
        this.t_log_id = t_log_id;
        this.t_staff_id = t_staff_id;
        this.t_date = t_date;
        this.t_WeekSeven = t_WeekSeven;
        this.t_WeekOne = t_WeekOne;
        this.t_WeekTwo = t_WeekTwo;
        this.t_WeekThree = t_WeekThree;
        this.t_WeekFour = t_WeekFour;
        this.t_WeekFive = t_WeekFive;
        this.t_WeekSix = t_WeekSix;
        this.t_summary = t_summary;
    }

    public void setT_log_id(String t_log_id) {
        this.t_log_id = t_log_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public void setT_date(String t_date) {
        this.t_date = t_date;
    }

    public void setT_WeekSeven(String t_WeekSeven) {
        this.t_WeekSeven = t_WeekSeven;
    }

    public void setT_WeekOne(String t_WeekOne) {
        this.t_WeekOne = t_WeekOne;
    }

    public void setT_WeekTwo(String t_WeekTwo) {
        this.t_WeekTwo = t_WeekTwo;
    }

    public void setT_WeekThree(String t_WeekThree) {
        this.t_WeekThree = t_WeekThree;
    }

    public void setT_WeekFour(String t_WeekFour) {
        this.t_WeekFour = t_WeekFour;
    }

    public void setT_WeekFive(String t_WeekFive) {
        this.t_WeekFive = t_WeekFive;
    }

    public void setT_WeekSix(String t_WeekSix) {
        this.t_WeekSix = t_WeekSix;
    }

    public void setT_summary(String t_summary) {
        this.t_summary = t_summary;
    }

    public String getT_log_id() {
        return t_log_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public String getT_date() {
        return t_date;
    }

    public String getT_WeekSeven() {
        return t_WeekSeven;
    }

    public String getT_WeekOne() {
        return t_WeekOne;
    }

    public String getT_WeekTwo() {
        return t_WeekTwo;
    }

    public String getT_WeekThree() {
        return t_WeekThree;
    }

    public String getT_WeekFour() {
        return t_WeekFour;
    }

    public String getT_WeekFive() {
        return t_WeekFive;
    }

    public String getT_WeekSix() {
        return t_WeekSix;
    }

    public String getT_summary() {
        return t_summary;
    }

    public com.ht.bean.T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(com.ht.bean.T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_journal{" +
                "t_log_id='" + t_log_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_date='" + t_date + '\'' +
                ", t_WeekSeven='" + t_WeekSeven + '\'' +
                ", t_WeekOne='" + t_WeekOne + '\'' +
                ", t_WeekTwo='" + t_WeekTwo + '\'' +
                ", t_WeekThree='" + t_WeekThree + '\'' +
                ", t_WeekFour='" + t_WeekFour + '\'' +
                ", t_WeekFive='" + t_WeekFive + '\'' +
                ", t_WeekSix='" + t_WeekSix + '\'' +
                ", t_summary='" + t_summary + '\'' +
                '}';
    }
}
