package com.glmapper.extention;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description: [描述文本]
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/21
 */
public class GlmapperInitializingBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("test afterPropertiesSet");
    }

    public void testInitMethod(){
        System.out.println("test init method");
    }
}
