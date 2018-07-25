package com.glmapper.extention;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @description: 用户注册服务，实现ApplicationEventPublisherAware接口，表明本身具有事件发布能力
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/25
 */
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String name) {
        System.out.println("用户：" + name + " 已注册！");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(name));
    }
}
