package com.ht.service;

import com.ht.bean.T_wages;
import com.ht.util.Pager4EasyUI;
import java.util.List;
import static org.hibernate.id.PersistentIdentifierGenerator.PK;

/**
 * Created by DengMin on 2016/8/16.
 */
public interface T_wagesService {
    public void save(T_wages t_wages);
    public void delete(T_wages t_wages);
    public T_wages update(T_wages t_wages);
    public List<T_wages> queryAll();
    public T_wages query(String p);
    public void close();
    public int count();
    public Pager4EasyUI<T_wages> Pagelist(Pager4EasyUI pager);
}
