package com.example.boot.demo.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: guolei.sgl
 * @since: 18/10/28
 */
@Component
public class GlmapperTestBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlmapperTestBean.class);
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlmapperTestBean() {
        LOGGER.info("bean begin to execute!");
    }
}
