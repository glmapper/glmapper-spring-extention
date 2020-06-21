package com.glmapper.extention.applicationcontextaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: MainTest
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/29
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.sayHello();

        //这里通过实现ApplicationContextAware接口的类来完成bean的获取
        GlmapperApplicationContext glmapperApplicationContext = (GlmapperApplicationContext) context
            .getBean("glmapperApplicationContext");
        ApplicationContext applicationContext = glmapperApplicationContext.getApplicationContext();
        HelloService glmapperHelloService = (HelloService) applicationContext
            .getBean("helloService");
        glmapperHelloService.sayHello();
    }
}
