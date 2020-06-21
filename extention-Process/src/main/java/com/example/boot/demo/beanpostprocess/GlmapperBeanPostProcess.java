package com.example.boot.demo.beanpostprocess;

import com.example.boot.demo.beanfactorypostprocess.GlmapperBeanFactoryPostProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: glmapper
 * @since: 18/10/28
 */
@Component
public class GlmapperBeanPostProcess implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlmapperBeanFactoryPostProcess.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("GlmapperBeanPostProcess begin to execute!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
