package com.example.boot.demo.beanfactorypostprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author: glmapper
 * @since: 18/10/28
 */
@Component
public class GlmapperBeanFactoryPostProcess implements BeanFactoryPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlmapperBeanFactoryPostProcess.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        LOGGER.info("GlmapperBeanFactoryPostProcess begin execute!");
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            if ("glmapperTestBean".equals(beanName)) {
                BeanDefinition beanDefinition = configurableListableBeanFactory
                        .getBeanDefinition(beanName);
                MutablePropertyValues m = beanDefinition.getPropertyValues();
                if (m.contains("name")) {
                    m.addPropertyValue("name", "glmapper");
                    LOGGER.info("glmapperTestBean's name properties value set by glmapper");
                }
            }
        }
    }
}
