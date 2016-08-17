package com.ht.service;

import com.ht.bean.T_staff;
import java.util.List;

/**
 * Created by DengMin on 2016/8/12.
 */
public interface T_staffService {
    public T_staff update(T_staff t_staff);
    public List<T_staff> queryAll();
    public void save(T_staff t_staff);
    public void delete(T_staff t_staff);
}
