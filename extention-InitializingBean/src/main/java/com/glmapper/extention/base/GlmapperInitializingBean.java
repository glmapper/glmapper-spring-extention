package com.glmapper.extention.base;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description: GlmapperInitializingBean
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/21
 */
public class GlmapperInitializingBean implements InitializingBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set name properties");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("test afterPropertiesSet");
    }
}
