package com.example.boot.demo.initializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * <p>
 * ApplicationContextInitializer是在springboot启动过程(refresh方法前)调用,
 * 主要是在ApplicationContextInitializer中initialize方法中拉起了ConfigurationClassPostProcessor这个类，
 * 通过这个processor实现了beanDefinition
 * </p>
 *
 * @author: guolei.sgl
 * @since: 18/10/28
 */
public class GlmapperApplicationContextInitializer implements ApplicationContextInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlmapperApplicationContextInitializer.class);
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        LOGGER.info("GlmapperApplicationContextInitializer begin to execute!");
    }
}
