package com.ht.action;

import com.ht.bean.T_announcement;
import com.ht.service.T_announcementService;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_announcementAction {
    private T_announcementService t_announcementService;
    private T_announcement t_announcement;

    public void setT_announcementService(T_announcementService t_announcementService) {
        this.t_announcementService = t_announcementService;
    }

    public void setT_announcement(T_announcement t_announcement) {
        this.t_announcement = t_announcement;
    }

    public String save(){
        t_announcementService.save(t_announcement);
        return "save";
    }

    public String delete(){
        t_announcementService.delete(t_announcement);
        return "delete";
    }

    public String update(){
        t_announcementService.update(t_announcement);
        return "update";
    }

    public String queryAll(){
        t_announcementService.queryAll();
        return "queryAll";
    }
}
