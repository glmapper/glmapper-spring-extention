package com.glmapper.extention.base;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description: GlmapperInitializingBean
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/21
 */
public class GlmapperInitializingBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("test afterPropertiesSet");
    }
}
