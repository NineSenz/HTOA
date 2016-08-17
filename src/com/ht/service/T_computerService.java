package com.ht.service;

import com.ht.bean.T_computer;
import com.ht.dao.T_computerDAO;

import java.util.List;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public interface T_computerService {
    public void save(T_computer t_computer);
    public void delete(T_computer t_computer);
    public T_computer update(T_computer t_computer);
    public List<T_computer> queryAll();
    public T_computer query(String p);
    public void close();
}
