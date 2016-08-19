package com.ht.bean;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_workcheckunusual {
    private String t_unusual_id;
    private String t_work_id;
    private String t_StateTime;
    private String t_reason;
    private com.ht.bean.T_staff t_staff;

    public T_workcheckunusual() {
    }

    public T_workcheckunusual(String t_unusual_id, String t_work_id, String t_StateTime, String t_reason) {
        this.t_unusual_id = t_unusual_id;
        this.t_work_id = t_work_id;
        this.t_StateTime = t_StateTime;
        this.t_reason = t_reason;
    }

    public void setT_unusual_id(String t_unusual_id) {
        this.t_unusual_id = t_unusual_id;
    }

    public void setT_work_id(String t_work_id) {
        this.t_work_id = t_work_id;
    }

    public void setT_StateTime(String t_StateTime) {
        this.t_StateTime = t_StateTime;
    }

    public void setT_reason(String t_reason) {
        this.t_reason = t_reason;
    }

    public String getT_unusual_id() {
        return t_unusual_id;
    }

    public String getT_work_id() {
        return t_work_id;
    }

    public String getT_StateTime() {
        return t_StateTime;
    }

    public String getT_reason() {
        return t_reason;
    }

    public com.ht.bean.T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(com.ht.bean.T_staff t_staff) {
        this.t_staff = t_staff;
    }

    @Override
    public String toString() {
        return "T_workcheckunusual{" +
                "t_unusual_id='" + t_unusual_id + '\'' +
                ", t_work_id='" + t_work_id + '\'' +
                ", t_StateTime='" + t_StateTime + '\'' +
                ", t_reason='" + t_reason + '\'' +
                '}';
    }
}
