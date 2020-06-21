package com.glmapper.extention;

import com.glmapper.extention.base.GlmapperInitMethod;
import com.glmapper.extention.base.GlmapperInitializingBean;
import com.glmapper.extention.use.GlmapperCacheManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: [描述文本]
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/21
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
            "beans.xml");
        //这里注意执行顺序；见输出
        GlmapperInitializingBean glmapperInitializingBean = (GlmapperInitializingBean) applicationContext
            .getBean("glmapperInitializingBean");

        GlmapperInitMethod glmapperInitMethod = (GlmapperInitMethod) applicationContext
            .getBean("glmapperInitMethod");

        GlmapperCacheManager glmapperCacheManager = (GlmapperCacheManager) applicationContext
            .getBean("glmapperCacheManager");
        System.out.println(glmapperCacheManager.getConflictStrategy());

    }
}
