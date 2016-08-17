package com.ht.action;

import com.ht.bean.T_computer;
import com.ht.service.T_computerService;
import com.ht.util.StampUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class T_computerAction extends ActionSupport {

    private T_computerService t_computerService;
    private T_computer t_computer;

    public void setT_computerService(T_computerService t_computerService) {
        this.t_computerService = t_computerService;
    }

    public void setT_computer(T_computer t_computer) {
        this.t_computer = t_computer;
    }

    public String save() throws ParseException {
        Date time = Calendar.getInstance().getTime(); //获取当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(time); //把获取到的当前时间转换为设定的格式并用String类型接收
        t_computer.setT_comp_id(StampUtil.dateToStamp(date));
        t_computer.setT_comp_stuid(StampUtil.dateToStamp(date));
        t_computer.setT_comp_component("ASUS");
        t_computer.setT_comp_date(date);
        t_computerService.save(t_computer);
        return "save";
    }

    public String delete(){
        t_computer.setT_comp_id("15231321545");
        t_computerService.delete(t_computer);
        return "delete";
    }

    public String update(){
        t_computer = t_computerService.update(t_computer);
        return "update";
    }

    public String query(){
        t_computer = t_computerService.query("123@168.com");
        System.out.println(t_computer);
        return "query";
    }

    public String queryAll(){
        t_computerService.queryAll();
        t_computerService.close();
        return "queryall";
    }

}
