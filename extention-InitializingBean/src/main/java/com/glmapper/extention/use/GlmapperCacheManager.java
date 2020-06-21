package com.glmapper.extention.use;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description: 通过 afterPropertiesSet 来模拟初始化缓存客户端
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/23
 */
public class GlmapperCacheManager implements InitializingBean {

    /**
     * 缓存最大个数
     */
    private int                  maxSize;

    /**
     * 缓存超时时间
     */
    private long                 timeOut;

    /**
     * 超过最大个数
     */
    private String               conflictStrategy;

    private GlmapperCacheManager cacheManager;

    private GlmapperCacheManager() {

    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(long timeOut) {
        this.timeOut = timeOut;
    }

    public String getConflictStrategy() {
        return conflictStrategy;
    }

    public void setConflictStrategy(String conflictStrategy) {
        this.conflictStrategy = conflictStrategy;
    }

    public void afterPropertiesSet() throws Exception {
        cacheManager = new GlmapperCacheManager();
        cacheManager.setConflictStrategy(conflictStrategy);
        cacheManager.setMaxSize(maxSize);
        cacheManager.setTimeOut(timeOut);
        System.out.println("glmapperCacheManager init success !");
    }
}
