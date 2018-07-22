package com.glmapper.extention.base;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description: GlmapperInitializingBean
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/21
 */
public class GlmapperInitializingBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("test afterPropertiesSet");
    }
}
