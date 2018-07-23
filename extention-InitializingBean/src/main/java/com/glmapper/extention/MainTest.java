package com.glmapper.extention;

import com.glmapper.extention.base.GlmapperInitMethod;
import com.glmapper.extention.base.GlmapperInitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: [描述文本]
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/21
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
            "beans.xml");
        GlmapperInitializingBean glmapperInitializingBean = (GlmapperInitializingBean) applicationContext
            .getBean("glmapperInitializingBean");

        GlmapperInitMethod glmapperInitMethod = (GlmapperInitMethod) applicationContext
            .getBean("glmapperInitMethod");

    }
}
