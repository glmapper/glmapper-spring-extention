package com.glmapper.test;

import javax.sql.DataSource;

/**
 * @author: glmapper (glmapper_2018@163.com) 18/12/11 ����9:07
 * @since:
 **/
public abstract class AbstractSource implements DataSource {

    protected DataSource delegate;

    public AbstractSource(DataSource delegate) {
        this.delegate = delegate;
    }

    public DataSource getDelegate() {
        return delegate;
    }

    public void setDelegate(DataSource delegate) {
        this.delegate = delegate;
    }

}
