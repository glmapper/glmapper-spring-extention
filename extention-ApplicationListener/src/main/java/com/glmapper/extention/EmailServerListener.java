package com.glmapper.extention;

import org.springframework.context.ApplicationListener;

/**
 * @description: 邮件服务监听器，当监听到用户的注册行为时，给用户发送邮件通知
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/25
 */
public class EmailServerListener implements ApplicationListener<UserRegisterEvent> {
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("邮件服务接到通知，给 " + event.getSource() + " 发送邮件...");
    }
}
