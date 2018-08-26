package com.glmapper.extention;

import com.glmapper.extention.support.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: MainTest
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/8/26
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
        ApplicationConfig applicationConfig = (ApplicationConfig) applicationContext.getBean("bridgeTestApplication");
        System.out.println(applicationConfig);
    }
}
