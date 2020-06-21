package com.glmapper.test;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * @author: glmapper (glmapper_2018@163.com) 18/12/11 ����9:08
 * @since:
 **/
public class GlmapperSource extends AbstractSource {

    public GlmapperSource(DataSource delegate) {
        super(delegate);
    }

    public GlmapperSource() {
        this(null);
    }

    public void init() {
        System.out.println("init .....");
    }

    public Connection getConnection() throws SQLException {
        return null;
    }

    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    public void setLoginTimeout(int seconds) throws SQLException {

    }

    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    public Logger getParentLogger() {
        return null;
    }
}
