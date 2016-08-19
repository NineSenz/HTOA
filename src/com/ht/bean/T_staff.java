package com.ht.bean;

import java.util.Set;

/**
 * Created by DengMin on 2016/8/12.
 */
public class T_staff {
    private String t_sta_id;
    private String t_sta_depid;
    private String t_sta_name;
    private String t_sta_sex;
    private String t_sta_place;
    private String t_sta_phone;
    private String t_sta_icard;
    private String t_sta_anton;
    private String t_sta_edu;
    private String t_sta_addr;
    private String t_sta_create;
    private int t_sta_status;
    private T_department t_department;
    private Set<T_education> t_educations;
    private Set<T_workcheck> t_workchecks;
    private Set<T_undergo> t_undergos;
    private Set<T_tickling> t_ticklings;
    private Set<T_beonduty> t_beonduties;
    private Set<T_familys> t_familys;
    private Set<T_journal> t_journals;
    private Set<T_OfficeDepot> t_officeDepots;
    private Set<T_inquire> t_inquires;
    private Set<T_course> t_courses;
    private Set<T_feedback> t_feedbacks;
    private Set<T_seminar> t_seminars;
    private Set<T_schedule> t_schedules;
    private Set<T_students> t_students;
    private Set<T_wages> t_wages;

    public T_staff() {}

    public T_staff(String t_sta_id, String t_sta_depid, String t_sta_name, String t_sta_sex, String t_sta_place, String t_sta_phone, String t_sta_icard, String t_sta_anton, String t_sta_edu, String t_sta_addr, String t_sta_create, int t_sta_status) {
        this.t_sta_id = t_sta_id;
        this.t_sta_depid = t_sta_depid;
        this.t_sta_name = t_sta_name;
        this.t_sta_sex = t_sta_sex;
        this.t_sta_place = t_sta_place;
        this.t_sta_phone = t_sta_phone;
        this.t_sta_icard = t_sta_icard;
        this.t_sta_anton = t_sta_anton;
        this.t_sta_edu = t_sta_edu;
        this.t_sta_addr = t_sta_addr;
        this.t_sta_create = t_sta_create;
        this.t_sta_status = t_sta_status;
    }

    public String getT_sta_id() {
        return t_sta_id;
    }

    public void setT_sta_id(String t_sta_id) {
        this.t_sta_id = t_sta_id;
    }

    public String getT_sta_depid() {
        return t_sta_depid;
    }

    public void setT_sta_depid(String t_sta_depid) {
        this.t_sta_depid = t_sta_depid;
    }

    public String getT_sta_name() {
        return t_sta_name;
    }

    public void setT_sta_name(String t_sta_name) {
        this.t_sta_name = t_sta_name;
    }

    public String getT_sta_sex() {
        return t_sta_sex;
    }

    public void setT_sta_sex(String t_sta_sex) {
        this.t_sta_sex = t_sta_sex;
    }

    public String getT_sta_place() {
        return t_sta_place;
    }

    public void setT_sta_place(String t_sta_place) {
        this.t_sta_place = t_sta_place;
    }

    public String getT_sta_phone() {
        return t_sta_phone;
    }

    public void setT_sta_phone(String t_sta_phone) {
        this.t_sta_phone = t_sta_phone;
    }

    public String getT_sta_icard() {
        return t_sta_icard;
    }

    public void setT_sta_icard(String t_sta_icard) {
        this.t_sta_icard = t_sta_icard;
    }

    public String getT_sta_anton() {
        return t_sta_anton;
    }

    public void setT_sta_anton(String t_sta_anton) {
        this.t_sta_anton = t_sta_anton;
    }

    public String getT_sta_edu() {
        return t_sta_edu;
    }

    public void setT_sta_edu(String t_sta_edu) {
        this.t_sta_edu = t_sta_edu;
    }

    public String getT_sta_addr() {
        return t_sta_addr;
    }

    public void setT_sta_addr(String t_sta_addr) {
        this.t_sta_addr = t_sta_addr;
    }

    public String getT_sta_create() {
        return t_sta_create;
    }

    public void setT_sta_create(String t_sta_create) {
        this.t_sta_create = t_sta_create;
    }

    public int getT_sta_status() {
        return t_sta_status;
    }

    public void setT_sta_status(int t_sta_status) {
        this.t_sta_status = t_sta_status;
    }

    public T_department getT_department() {
        return t_department;
    }

    public void setT_department(T_department t_department) {
        this.t_department = t_department;
    }

    public Set<T_education> getT_educations() {
        return t_educations;
    }

    public void setT_educations(Set<T_education> t_educations) {
        this.t_educations = t_educations;
    }

    public Set<T_workcheck> getT_workchecks() {
        return t_workchecks;
    }

    public void setT_workchecks(Set<T_workcheck> t_workchecks) {
        this.t_workchecks = t_workchecks;
    }

    public Set<T_undergo> getT_undergos() {
        return t_undergos;
    }

    public void setT_undergos(Set<T_undergo> t_undergos) {
        this.t_undergos = t_undergos;
    }

    public Set<T_tickling> getT_ticklings() {
        return t_ticklings;
    }

    public void setT_ticklings(Set<T_tickling> t_ticklings) {
        this.t_ticklings = t_ticklings;
    }

    public Set<T_beonduty> getT_beonduties() {
        return t_beonduties;
    }

    public void setT_beonduties(Set<T_beonduty> t_beonduties) {
        this.t_beonduties = t_beonduties;
    }

    public Set<T_familys> getT_familys() {
        return t_familys;
    }

    public void setT_familys(Set<T_familys> t_familys) {
        this.t_familys = t_familys;
    }

    public Set<T_journal> getT_journals() {
        return t_journals;
    }

    public void setT_journals(Set<T_journal> t_journals) {
        this.t_journals = t_journals;
    }

    public Set<T_OfficeDepot> getT_officeDepots() {
        return t_officeDepots;
    }

    public void setT_officeDepots(Set<T_OfficeDepot> t_officeDepots) {
        this.t_officeDepots = t_officeDepots;
    }

    public Set<T_inquire> getT_inquires() {
        return t_inquires;
    }

    public void setT_inquires(Set<T_inquire> t_inquires) {
        this.t_inquires = t_inquires;
    }

    public Set<T_course> getT_courses() {
        return t_courses;
    }

    public void setT_courses(Set<T_course> t_courses) {
        this.t_courses = t_courses;
    }

    public Set<T_feedback> getT_feedbacks() {
        return t_feedbacks;
    }

    public void setT_feedbacks(Set<T_feedback> t_feedbacks) {
        this.t_feedbacks = t_feedbacks;
    }

    public Set<T_seminar> getT_seminars() {
        return t_seminars;
    }

    public void setT_seminars(Set<T_seminar> t_seminars) {
        this.t_seminars = t_seminars;
    }

    public Set<T_schedule> getT_schedules() {
        return t_schedules;
    }

    public Set<T_students> getT_students() {
        return t_students;
    }

    public void setT_students(Set<T_students> t_students) {
        this.t_students = t_students;
    }

    public void setT_schedules(Set<T_schedule> t_schedules) {
        this.t_schedules = t_schedules;
    }

    public Set<T_wages> getT_wages() {
        return t_wages;
    }

    public void setT_wages(Set<T_wages> t_wages) {
        this.t_wages = t_wages;
    }
}
