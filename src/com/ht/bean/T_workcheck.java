package com.ht.bean;

import java.util.Set;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_workcheck {
    private String t_work_id;
    private String t_staff_id;
    private String t_time;
    private String t_clock_TimeOne;
    private String t_clock_TimeTwo;
    private String t_clock_TimeThree;
    private String t_clock_TimeFour;
    private T_staff t_staff;
    private Set<T_workcheckunusual> t_workcheckunusuals;

    public T_workcheck(){}

    public T_workcheck(String t_work_id, String t_staff_id, String t_time, String t_clock_TimeOne, String t_clock_TimeTwo, String t_clock_TimeThree, String t_clock_TimeFour) {
        this.t_work_id = t_work_id;
        this.t_staff_id = t_staff_id;
        this.t_time = t_time;
        this.t_clock_TimeOne = t_clock_TimeOne;
        this.t_clock_TimeTwo = t_clock_TimeTwo;
        this.t_clock_TimeThree = t_clock_TimeThree;
        this.t_clock_TimeFour = t_clock_TimeFour;
    }

    public String getT_work_id() {
        return t_work_id;
    }

    public void setT_work_id(String t_work_id) {
        this.t_work_id = t_work_id;
    }

    public String getT_staff_id() {
        return t_staff_id;
    }

    public void setT_staff_id(String t_staff_id) {
        this.t_staff_id = t_staff_id;
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }

    public String getT_clock_TimeOne() {
        return t_clock_TimeOne;
    }

    public void setT_clock_TimeOne(String t_clock_TimeOne) {
        this.t_clock_TimeOne = t_clock_TimeOne;
    }

    public String getT_clock_TimeTwo() {
        return t_clock_TimeTwo;
    }

    public void setT_clock_TimeTwo(String t_clock_TimeTwo) {
        this.t_clock_TimeTwo = t_clock_TimeTwo;
    }

    public String getT_clock_TimeThree() {
        return t_clock_TimeThree;
    }

    public void setT_clock_TimeThree(String t_clock_TimeThree) {
        this.t_clock_TimeThree = t_clock_TimeThree;
    }

    public String getT_clock_TimeFour() {
        return t_clock_TimeFour;
    }

    public void setT_clock_TimeFour(String t_clock_TimeFour) {
        this.t_clock_TimeFour = t_clock_TimeFour;
    }

    public T_staff getT_staff() {
        return t_staff;
    }

    public void setT_staff(T_staff t_staff) {
        this.t_staff = t_staff;
    }

    public Set<T_workcheckunusual> getT_workcheckunusuals() {
        return t_workcheckunusuals;
    }

    public void setT_workcheckunusuals(Set<T_workcheckunusual> t_workcheckunusuals) {
        this.t_workcheckunusuals = t_workcheckunusuals;
    }

    @Override
    public String toString() {
        return "T_workcheck{" +
                "t_work_id='" + t_work_id + '\'' +
                ", t_staff_id='" + t_staff_id + '\'' +
                ", t_time='" + t_time + '\'' +
                ", t_clock_TimeOne='" + t_clock_TimeOne + '\'' +
                ", t_clock_TimeTwo='" + t_clock_TimeTwo + '\'' +
                ", t_clock_TimeThree='" + t_clock_TimeThree + '\'' +
                ", t_clock_TimeFour='" + t_clock_TimeFour + '\'' +
                '}';
    }
}
