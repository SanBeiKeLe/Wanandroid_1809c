package com.com.wanghongli.myapplication.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.wanghongli.myapplication.wxtwo.TabBean;
import com.wanghongli.myapplication.todaynews.DataBean;
import com.wanghongli.myapplication.todaynews.DatasBean;

import com.com.wanghongli.myapplication.dao.TabBeanDao;
import com.com.wanghongli.myapplication.dao.DataBeanDao;
import com.com.wanghongli.myapplication.dao.DatasBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig tabBeanDaoConfig;
    private final DaoConfig dataBeanDaoConfig;
    private final DaoConfig datasBeanDaoConfig;

    private final TabBeanDao tabBeanDao;
    private final DataBeanDao dataBeanDao;
    private final DatasBeanDao datasBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        tabBeanDaoConfig = daoConfigMap.get(TabBeanDao.class).clone();
        tabBeanDaoConfig.initIdentityScope(type);

        dataBeanDaoConfig = daoConfigMap.get(DataBeanDao.class).clone();
        dataBeanDaoConfig.initIdentityScope(type);

        datasBeanDaoConfig = daoConfigMap.get(DatasBeanDao.class).clone();
        datasBeanDaoConfig.initIdentityScope(type);

        tabBeanDao = new TabBeanDao(tabBeanDaoConfig, this);
        dataBeanDao = new DataBeanDao(dataBeanDaoConfig, this);
        datasBeanDao = new DatasBeanDao(datasBeanDaoConfig, this);

        registerDao(TabBean.class, tabBeanDao);
        registerDao(DataBean.class, dataBeanDao);
        registerDao(DatasBean.class, datasBeanDao);
    }
    
    public void clear() {
        tabBeanDaoConfig.clearIdentityScope();
        dataBeanDaoConfig.clearIdentityScope();
        datasBeanDaoConfig.clearIdentityScope();
    }

    public TabBeanDao getTabBeanDao() {
        return tabBeanDao;
    }

    public DataBeanDao getDataBeanDao() {
        return dataBeanDao;
    }

    public DatasBeanDao getDatasBeanDao() {
        return datasBeanDao;
    }

}
