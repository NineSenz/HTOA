package com.ht.action;

import com.ht.bean.T_reply;
import com.ht.service.T_replyService;
import com.ht.util.StampUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by please fresh on 2016/8/16.
 */
public class T_replyAction extends ActionSupport {
    private T_replyService t_replyService;
    private T_reply t_reply;

    public void setT_replyService(T_replyService t_replyService) {
        this.t_replyService = t_replyService;
    }

    public void setT_reply(T_reply t_reply) {
        this.t_reply = t_reply;
    }

    public String save() throws ParseException {
        Date time = Calendar.getInstance().getTime(); //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(time); //把获取到的当前时间转换为设定的格式并用String类型接
        t_reply.setT_rep_id(StampUtil.dateToStamp(date));
        t_reply.setT_rep_name("OA系统");
        t_reply.setT_rep_staid("2134");
        t_reply.setT_rep_stuid("235");
        t_reply.setT_rep_score(92);
        t_reply.setT_rep_date("2016");
        t_replyService.save(t_reply);
        return "save";
    }

    public String update(){
        t_replyService.update(t_reply);
        return "save";
    }

    public String delete(){
        t_replyService.delete(t_reply);
        return "save";
    }

    public String query(){
        t_replyService.query("");
        return "queryAll";
    }

    public String queryAll(){
        t_replyService.queryAll();
        t_replyService.close();
        return "queryAll";
    }
}
