package com.glmapper.extention;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 客户端类
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/25
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        //注册事件触发
        userService.register("glmapper");
    }
}
