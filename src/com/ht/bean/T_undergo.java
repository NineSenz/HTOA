package com.ht.bean;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_undergo {
    private String t_undergo_id;
    private String t_staff_id;
    private String t_AirTime;
    private String t_FinishTime;
    private String t_FirmName;
    private String t_FirmPost;
    private String t_prove;
    private String t_ProvePhone;
    private com.ht.bean.T_staff t_staff;

    public T_undergo() {
    }

    public T_undergo(String t_undergo_id, String t_staff_id, String t_AirTime, String t_FinishTime, String t_FirmName, String t_FirmPost, String t_prove, String t_ProvePhone) {
        this.t_undergo_id = t_undergo_id;
        this.t_staff_id = t_staff_id;
        this.t_AirTime = t_AirTime;
        this.t_FinishTime = t_FinishTime;
        this.t_FirmName = t_FirmName;
        this.t_FirmPost = t_FirmPost;
        this.t_prove = t_prove;
        this.t_ProvePhone = t_ProvePhone;
    }

    public void setT_undergo_id(String t_undergo_id) {
        this.t_undergo_id = t_undergo_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public void setT_AirTime(String t_AirTime) {
        this.t_AirTime = t_AirTime;
    }

    public void setT_FinishTime(String t_FinishTime) {
        this.t_FinishTime = t_FinishTime;
    }

    public void setT_FirmName(String t_FirmName) {
        this.t_FirmName = t_FirmName;
    }

    public void setT_FirmPost(String t_FirmPost) {
        this.t_FirmPost = t_FirmPost;
    }

    public void setT_prove(String t_prove) {
        this.t_prove = t_prove;
    }

    public void setT_ProvePhone(String t_ProvePhone) {
        this.t_ProvePhone = t_ProvePhone;
    }

    public String getT_undergo_id() {
        return t_undergo_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public String getT_AirTime() {
        return t_AirTime;
    }

    public String getT_FinishTime() {
        return t_FinishTime;
    }

    public String getT_FirmName() {
        return t_FirmName;
    }

    public String getT_FirmPost() {
        return t_FirmPost;
    }

    public String getT_prove() {
        return t_prove;
    }

    public String getT_ProvePhone() {
        return t_ProvePhone;
    }

    public com.ht.bean.T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(com.ht.bean.T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_undergo{" +
                "t_undergo_id='" + t_undergo_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_AirTime='" + t_AirTime + '\'' +
                ", t_FinishTime='" + t_FinishTime + '\'' +
                ", t_FirmName='" + t_FirmName + '\'' +
                ", t_FirmPost='" + t_FirmPost + '\'' +
                ", t_prove='" + t_prove + '\'' +
                ", t_ProvePhone='" + t_ProvePhone + '\'' +
                '}';
    }
}
