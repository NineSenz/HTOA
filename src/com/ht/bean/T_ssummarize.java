package com.ht.bean;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_ssummarize {
    private String t_summ_id;
    private String t_summ_stuid;
    private String t_summ_remark;

    public T_ssummarize(String t_summ_id, String t_summ_stuid, String t_summ_remark) {
        this.t_summ_id = t_summ_id;
        this.t_summ_stuid = t_summ_stuid;
        this.t_summ_remark = t_summ_remark;
    }

    public T_ssummarize() {
    }

    public String getT_summ_id() {
        return t_summ_id;
    }

    public void setT_summ_id(String t_summ_id) {
        this.t_summ_id = t_summ_id;
    }

    public String getT_summ_stuid() {
        return t_summ_stuid;
    }

    public void setT_summ_stuid(String t_summ_stuid) {
        this.t_summ_stuid = t_summ_stuid;
    }

    public String getT_summ_remark() {
        return t_summ_remark;
    }

    public void setT_summ_remark(String t_summ_remark) {
        this.t_summ_remark = t_summ_remark;
    }

    @Override
    public String toString() {
        return "T_ssummarize{" +
                "t_summ_id='" + t_summ_id + '\'' +
                ", t_summ_stuid='" + t_summ_stuid + '\'' +
                ", t_summ_remark='" + t_summ_remark + '\'' +
                '}';
    }
}
