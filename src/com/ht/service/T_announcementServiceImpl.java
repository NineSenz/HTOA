package com.ht.service;

import com.ht.bean.T_announcement;
import com.ht.dao.T_announcementDAO;
import com.ht.util.Pager;
import java.util.List;

/**
 * Created by DengMin on 2016/8/17.
 */
public class T_announcementServiceImpl implements T_announcementService{
    private T_announcementDAO t_announcementDAO;

    public void setT_announcementDAO(T_announcementDAO t_announcementDAO) {
        this.t_announcementDAO = t_announcementDAO;
    }

    @Override
    public T_announcement save(T_announcement t_announcement) {

        return t_announcementDAO.save(t_announcement);
    }

    @Override
    public void delete(T_announcement t_announcement) {
        t_announcementDAO.delete(t_announcement);
    }

    @Override
    public T_announcement update(T_announcement t_announcement) {
        return t_announcementDAO.update(t_announcement);
    }

    @Override
    public List<T_announcement> queryAll() {
        return t_announcementDAO.queryAll();
    }

    @Override
    public T_announcement query(String p) {
        return null;
    }

    @Override
    public void close() {
        t_announcementDAO.close();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager<T_announcement> pagerList(Pager pager) {
        return null;
    }
}
