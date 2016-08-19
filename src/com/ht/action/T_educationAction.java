package com.ht.action;

import com.ht.bean.T_education;
import com.ht.service.T_educationService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Tom on 2016/8/17.
 */
public class T_educationAction {
    private T_educationService t_educationService;
    private T_education t_education;

    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_education.setT_educate_id("1");
        t_education.setT_staff_id("11");
        t_education.setT_school("赣技");
        t_education.setT_education("脓");
        t_education.setT_StartTime(date);
        t_education.setT_EndTime(date);
        t_educationService.save(t_education);

        return "save";
    }
}
