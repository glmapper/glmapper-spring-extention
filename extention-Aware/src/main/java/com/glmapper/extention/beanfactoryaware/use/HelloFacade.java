package com.glmapper.extention.beanfactoryaware.use;

import com.glmapper.extention.beanfactoryaware.GlmapperBeanFactory;

/**
 * @description: HelloFacade
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/29
 */
public class HelloFacade {

    private GlmapperBeanFactory glmapperBeanFactory;

    public void sayHello(String beanName) {
        glmapperBeanFactory.execute(beanName);
    }

    public void setGlmapperBeanFactory(GlmapperBeanFactory beanFactory) {
        this.glmapperBeanFactory = beanFactory;
    }
}
