package com.ht.action;

import com.ht.bean.T_feedback;
import com.ht.service.T_feedbackService;

/**
 * Created by DengMin on 2016/8/16.
 */
public class T_feedbackAction {
    private T_feedbackService t_feedbackService;
    private T_feedback t_feedback;

    public void setT_feedbackService(T_feedbackService t_feedbackService) {
        this.t_feedbackService = t_feedbackService;
    }

    public void setT_feedback(T_feedback t_feedback) {
        this.t_feedback = t_feedback;
    }

    public String save(){
        t_feedbackService.save(t_feedback);
        return "save";
    }

    public String delete(){
        t_feedbackService.delete(t_feedback);
        return "delete";
    }

    public String update(){
        t_feedbackService.update(t_feedback);
        return "update";
    }

    public String queryAll(){
        t_feedbackService.queryAll();
        return "queryAll";
    }
}
