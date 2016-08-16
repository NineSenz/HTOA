package com.ht.action;

import com.ht.bean.T_department;
import com.ht.bean.T_ssummarize;
import com.ht.service.T_ssummarizeService;

import java.util.List;

/**
 * Created by Vicky on 2016/8/16.
 */
public class T_ssummarizeAction {

    private T_ssummarizeService t_ssummarizeService;

    private T_ssummarize t_ssummarize;

    public void setT_ssummarizeService(T_ssummarizeService t_ssummarizeService) {
        this.t_ssummarizeService = t_ssummarizeService;
    }

    public void setT_ssummarize(T_ssummarize t_ssummarize) {
        this.t_ssummarize = t_ssummarize;
    }

    public String save(){
        t_ssummarize.setT_summ_id("1");
        t_ssummarize.setT_summ_remark("良好");
        t_ssummarize.setT_summ_stuid("3");
        t_ssummarizeService.save(t_ssummarize);
        return "save";
    }

    public String queryAll(){
        t_ssummarizeService.queryAll();
        return "queryAll";
    }

    public String update(){
        t_ssummarizeService.update(t_ssummarize);
        return"update";
    }

    public String query(){
        t_ssummarizeService.query("p");
        return "query";
    }

    public String delete(){
        t_ssummarizeService.delete(t_ssummarize);
        return "delete";
    }

}
