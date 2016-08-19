package com.ht.bean;

import java.util.Set;

public class T_students {
    private String t_stu_id;
    private String t_stu_dormid;
    private String t_stu_staid;
    private String t_stu_claid;
    private String t_stu_name;
    private String t_stu_sex;
    private String t_stu_age;
    private String t_stu_phone;
    private String t_stu_parcall;
    private String t_stu_parname;
    private String t_stu_icard;
    private String t_stu_scholl;
    private String t_stu_birth;
    private String t_stu_addr;
    private String t_stu_create;
    private String t_stu_status;
    private T_dormitory t_dormitory;
    private T_class t_class;
    private T_staff t_staffs;
    private Set<T_rap> t_raps;
    private Set<T_grade> t_grades;
    private T_reply t_reply;
    private Set<T_ssummarize> t_ssummarize;
    private Set<T_obtainjob> t_obtainjob;
    private Set<T_opinion> t_opinions;

    public T_students() { }

    public T_students(String t_stu_id, String t_stu_dormid, String t_stu_claid, String t_stu_name, String t_stu_sex, String t_stu_age, String t_stu_phone, String t_stu_parcall, String t_stu_parname, String t_stu_icard, String t_stu_scholl, String t_stu_birth, String t_stu_addr, String t_stu_create, String t_stu_status) {
        this.t_stu_id = t_stu_id;
        this.t_stu_dormid = t_stu_dormid;
        this.t_stu_claid = t_stu_claid;
        this.t_stu_name = t_stu_name;
        this.t_stu_sex = t_stu_sex;
        this.t_stu_age = t_stu_age;
        this.t_stu_phone = t_stu_phone;
        this.t_stu_parcall = t_stu_parcall;
        this.t_stu_parname = t_stu_parname;
        this.t_stu_icard = t_stu_icard;
        this.t_stu_scholl = t_stu_scholl;
        this.t_stu_birth = t_stu_birth;
        this.t_stu_addr = t_stu_addr;
        this.t_stu_create = t_stu_create;
        this.t_stu_status = t_stu_status;
    }

    public void setT_stu_id(String t_stu_id) {
        this.t_stu_id = t_stu_id;
    }

    public String getT_stu_staid() {
        return t_stu_staid;
    }

    public void setT_stu_staid(String t_stu_staid) {
        this.t_stu_staid = t_stu_staid;
    }

    public void setT_stu_dormid(String t_stu_dormid) {
        this.t_stu_dormid = t_stu_dormid;
    }

    public void setT_stu_claid(String t_stu_claid) {
        this.t_stu_claid = t_stu_claid;
    }

    public void setT_stu_name(String t_stu_name) {
        this.t_stu_name = t_stu_name;
    }

    public void setT_stu_sex(String t_stu_sex) {
        this.t_stu_sex = t_stu_sex;
    }

    public void setT_stu_age(String t_stu_age) {
        this.t_stu_age = t_stu_age;
    }

    public void setT_stu_phone(String t_stu_phone) {
        this.t_stu_phone = t_stu_phone;
    }

    public void setT_stu_parcall(String t_stu_parcall) {
        this.t_stu_parcall = t_stu_parcall;
    }

    public void setT_stu_parname(String t_stu_parname) {
        this.t_stu_parname = t_stu_parname;
    }

    public void setT_stu_icard(String t_stu_icard) {
        this.t_stu_icard = t_stu_icard;
    }

    public void setT_stu_scholl(String t_stu_scholl) {
        this.t_stu_scholl = t_stu_scholl;
    }

    public void setT_stu_birth(String t_stu_birth) {
        this.t_stu_birth = t_stu_birth;
    }

    public void setT_stu_addr(String t_stu_addr) {
        this.t_stu_addr = t_stu_addr;
    }

    public void setT_stu_create(String t_stu_create) {
        this.t_stu_create = t_stu_create;
    }

    public void setT_stu_status(String t_stu_status) {
        this.t_stu_status = t_stu_status;
    }

    public String getT_stu_id() {
        return t_stu_id;
    }

    public String getT_stu_dormid() {
        return t_stu_dormid;
    }

    public String getT_stu_claid() {
        return t_stu_claid;
    }

    public String getT_stu_name() {
        return t_stu_name;
    }

    public String getT_stu_sex() {
        return t_stu_sex;
    }

    public String getT_stu_age() {
        return t_stu_age;
    }

    public String getT_stu_phone() {
        return t_stu_phone;
    }

    public String getT_stu_parcall() {
        return t_stu_parcall;
    }

    public String getT_stu_parname() {
        return t_stu_parname;
    }

    public String getT_stu_icard() {
        return t_stu_icard;
    }

    public String getT_stu_scholl() {
        return t_stu_scholl;
    }

    public String getT_stu_birth() {
        return t_stu_birth;
    }

    public String getT_stu_addr() {
        return t_stu_addr;
    }

    public String getT_stu_create() {
        return t_stu_create;
    }

    public String getT_stu_status() {
        return t_stu_status;
    }

    public T_dormitory getT_dormitory() {
        return t_dormitory;
    }

    public void setT_dormitory(T_dormitory t_dormitory) {
        this.t_dormitory = t_dormitory;
    }

    public T_class getT_class() {
        return t_class;
    }

    public void setT_class(T_class t_class) {
        this.t_class = t_class;
    }

    public T_staff getT_staffs() {
        return t_staffs;
    }

    public void setT_staffs(T_staff t_staffs) {
        this.t_staffs = t_staffs;
    }

    public Set<T_rap> getT_raps() {
        return t_raps;
    }

    public void setT_raps(Set<T_rap> t_raps) {
        this.t_raps = t_raps;
    }

    public Set<T_grade> getT_grades() {
        return t_grades;
    }

    public void setT_grades(Set<T_grade> t_grades) {
        this.t_grades = t_grades;
    }

    public T_reply getT_reply() {
        return t_reply;
    }

    public void setT_reply(T_reply t_reply) {
        this.t_reply = t_reply;
    }

    public Set<T_ssummarize> getT_ssummarize() {
        return t_ssummarize;
    }

    public void setT_ssummarize(Set<T_ssummarize> t_ssummarize) {
        this.t_ssummarize = t_ssummarize;
    }

    public Set<T_obtainjob> getT_obtainjob() {
        return t_obtainjob;
    }

    public void setT_obtainjob(Set<T_obtainjob> t_obtainjob) {
        this.t_obtainjob = t_obtainjob;
    }

    public Set<T_opinion> getT_opinions() {
        return t_opinions;
    }

    public void setT_opinions(Set<T_opinion> t_opinions) {
        this.t_opinions = t_opinions;
    }

    @Override
    public String toString() {
        return "T_students{" +
                "t_stu_id='" + t_stu_id + '\'' +
                ", t_stu_dormid='" + t_stu_dormid + '\'' +
                ", t_stu_claid='" + t_stu_claid + '\'' +
                ", t_stu_name='" + t_stu_name + '\'' +
                ", t_stu_sex='" + t_stu_sex + '\'' +
                ", t_stu_age='" + t_stu_age + '\'' +
                ", t_stu_phone='" + t_stu_phone + '\'' +
                ", t_stu_parcall='" + t_stu_parcall + '\'' +
                ", t_stu_parname='" + t_stu_parname + '\'' +
                ", t_stu_icard='" + t_stu_icard + '\'' +
                ", t_stu_scholl='" + t_stu_scholl + '\'' +
                ", t_stu_birth='" + t_stu_birth + '\'' +
                ", t_stu_addr='" + t_stu_addr + '\'' +
                ", t_stu_create='" + t_stu_create + '\'' +
                ", t_stu_status='" + t_stu_status + '\'' +
                '}';
    }
}
