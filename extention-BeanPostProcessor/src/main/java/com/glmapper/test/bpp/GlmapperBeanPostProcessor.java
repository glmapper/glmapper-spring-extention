package com.glmapper.test.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author: glmapper (glmapper_2018@163.com) 2019/3/24 5:15 PM
 * @since:
 **/
public class GlmapperBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName)
                                                                               throws BeansException {
        /**
         * 这里我们可以修改 bean
         */
        System.out.println("GlmapperBeanPostProcessor start ~~~~~~~~~,beanName = " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
                                                                              throws BeansException {
        System.out.println("GlmapperBeanPostProcessor end ~~~~~~~~~,beanName = " + beanName);
        return bean;
    }
}
