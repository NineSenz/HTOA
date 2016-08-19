package com.ht.action;

import com.ht.bean.T_journal;
import com.ht.dao.T_journalDAO;
import com.ht.service.T_journalService;
import com.opensymphony.xwork2.ActionSupport;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by liujie on 2016/8/17.
 */
public class T_journalAction extends ActionSupport {
    private T_journalService t_journalService;
    private T_journal t_journal;

    public void setT_journalService(T_journalService t_journalService) {
        this.t_journalService = t_journalService;
    }

    public void setT_journal(T_journal t_journal) {
        this.t_journal = t_journal;
    }
    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(cld);
        t_journal.setT_log_id("6");
        t_journal.setT_staff_id("5");
        t_journal.setT_date(date);
        t_journal.setT_WeekSeven("七");
        t_journal.setT_WeekOne("一");
        t_journal.setT_WeekTwo("二");
        t_journal.setT_WeekThree("三");
        t_journal.setT_WeekFour("四");
        t_journal.setT_WeekFive("五");
        t_journal.setT_WeekSix("六");
        t_journal.setT_summary("总结");
        t_journalService.save(t_journal);
        return "save";
    }
    public String delete(){
        t_journal.setT_log_id("6");
        t_journalService.delete(t_journal);
        return "delete";
    }
    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(cld);
        t_journal.setT_log_id("6");
        t_journal.setT_staff_id("54");
        t_journal.setT_date(date);
        t_journal.setT_WeekSeven("sd");
        t_journal.setT_WeekOne("fg");
        t_journal.setT_WeekTwo("k");
        t_journal.setT_WeekThree("d");
        t_journal.setT_WeekFour("df");
        t_journal.setT_WeekFive("jm");
        t_journal.setT_WeekSix("bn");
        t_journal.setT_summary("wq");
        t_journalService.update(t_journal);
        return "update";
    }
    public String queryAll(){
        List<T_journal> list=t_journalService.queryAll();
        for (T_journal t_journal:list){
            System.out.println(t_journal);
        }
        return "queryAll";
    }
}
