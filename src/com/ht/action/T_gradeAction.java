package com.ht.action;

import com.ht.bean.T_grade;
import com.ht.service.T_gradeService;
import com.ht.util.StampUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_gradeAction extends ActionSupport{
    private T_grade t_grade;
    private T_gradeService t_gradeService;

    public void setT_grade(T_grade t_grade) {
        this.t_grade = t_grade;
    }

    public void setT_gradeService(T_gradeService t_gradeService) {
        this.t_gradeService = t_gradeService;
    }

    public String save() throws ParseException {
        Date time = Calendar.getInstance().getTime(); //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(time); //把获取到的当前时间转换为设定的格式并用String类型接

        t_grade.setT_gr_id(StampUtil.dateToStamp(date));
        t_grade.setT_gr_claid("986");
        t_grade.setT_gr_grade(87);
        t_grade.setT_gr_scouid("2342");
        t_grade.setT_gr_stuid("d234");
        t_grade.setT_gr_time("2016-8-16");
        t_gradeService.save(t_grade);
        return "save";
    }

    public String update(){
        t_grade.setT_gr_id("1471312139000");
        t_grade.setT_gr_claid("979");
        t_grade.setT_gr_grade(100);
        t_grade.setT_gr_scouid("2342");
        t_grade.setT_gr_stuid("d234");
        t_grade.setT_gr_time("2016-8-16");
        t_gradeService.update(t_grade);
        return "save";
    }

    public String delete(){
        t_grade.setT_gr_id("1471312139000");
        t_gradeService.delete(t_grade);
        return "save";
    }

    public String query(){
        t_grade = t_gradeService.query("1471312139000");
        System.out.println(t_grade);
        return "save";
    }

    public String queryAll(){
        List<T_grade> list = t_gradeService.queryAll();
        t_gradeService.close();
        System.out.println(list.get(0));
        return "queryAll";
    }


}
