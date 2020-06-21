package com.glmapper.test;

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

        Object smartDataSource = applicationContext.getBean("smartDataSource");

        System.out.println(smartDataSource);
    }
}
