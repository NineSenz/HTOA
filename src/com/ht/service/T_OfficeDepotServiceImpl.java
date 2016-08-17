package com.ht.service;

import com.ht.bean.T_OfficeDepot;
import com.ht.dao.T_OfficeDepotDAO;
import com.ht.util.Pager4EasyUI;

import java.util.List;

/**
 * Created by liujie on 2016/8/13.
 */
public class T_OfficeDepotServiceImpl implements T_OfficeDepotService {
    private T_OfficeDepotDAO t_officeDepotDAO;

    public void setT_officeDepotDAO(T_OfficeDepotDAO t_officeDepotDAO) {
        this.t_officeDepotDAO = t_officeDepotDAO;
    }

    @Override
    public void save(T_OfficeDepot t_officeDepot) {
        t_officeDepotDAO.save(t_officeDepot);
    }

    @Override
    public void delete(T_OfficeDepot t_officeDepot) {
        t_officeDepotDAO.delete(t_officeDepot);
    }

    @Override
    public T_OfficeDepot update(T_OfficeDepot t_officeDepot) {
        return t_officeDepotDAO.update(t_officeDepot);
    }

    @Override
    public List<T_OfficeDepot> queryAll() {
        return t_officeDepotDAO.queryAll();
    }

    @Override
    public T_OfficeDepot query(String p) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Pager4EasyUI<T_OfficeDepot> pagerList(Pager4EasyUI pager) {
        return null;
    }
}
