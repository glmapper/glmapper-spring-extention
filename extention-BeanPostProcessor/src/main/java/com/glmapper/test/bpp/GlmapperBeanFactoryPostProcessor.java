package com.glmapper.test.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author: glmapper (glmapper_2018@163.com) 2019/3/24 6:05 PM
 * @since:
 **/
public class GlmapperBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
                                                                                   throws BeansException {
        System.out.println("GlmapperBeanFactoryPostProcessor start ~~~~");
        String[] beans = beanFactory.getBeanDefinitionNames();
        for (String beanName : beans) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            System.out.println(beanDefinition.getBeanClassName() + " - "
                               + beanDefinition.getFactoryBeanName());
            String[] depenctOn = beanDefinition.getDependsOn();
            if (depenctOn != null) {
                for (String dedency : depenctOn) {
                    System.out.println(dedency);
                }
            }
        }
    }
}
