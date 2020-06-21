package com.example.boot.demo.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: glmapper (glmapper_2018@163.com) 2020/6/21 9:07 PM
 * @since:
 **/
@Component
public class GlmapperBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.contains("glmapper")){
            System.out.println("before --------------------------");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.contains("glmapper")){
            System.out.println("after --------------------------");
        }
        return bean;
    }
}
