package com.ht.action;
import com.ht.bean.T_talk;
import com.ht.service.T_talkService;
import com.opensymphony.xwork2.ActionSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class T_talkAction extends ActionSupport{
    private T_talk t_talk;
    private T_talkService t_talkService;

    public void setT_talkService(T_talkService t_talkService) {
        this.t_talkService = t_talkService;
    }

    public void setT_talk(T_talk t_talk) {
        this.t_talk = t_talk;
    }


    public String save(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_talk.setT_talk_id("444");
        t_talk.setT_talk_details("444");
        t_talk.setT_talk_number("4444");
        t_talk.setT_talk_staid("4444");
        t_talk.setT_talk_stuid("44");
        t_talk.setT_talk_title("444");
        t_talk.setT_talk_time(date);
        t_talkService.save(t_talk);
        return "save";
    }

    public String delete(){
        t_talk.setT_talk_id("1");
        t_talkService.delete(t_talk);
        return "delete";
    }

    public String update(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        t_talk.setT_talk_id("222");
        t_talk.setT_talk_details("改2");
        t_talk.setT_talk_number("改2");
        t_talk.setT_talk_staid("改2");
        t_talk.setT_talk_stuid("改2");
        t_talk.setT_talk_title("改2");
        t_talk.setT_talk_time(date);
        t_talkService.update(t_talk);
        return "update";
    }

    public String queryAll(){
        List<T_talk> list = t_talkService.queryAll();
        for(T_talk talk : list){
            System.out.println(talk);
        }
        return "queryAll";
    }

}
