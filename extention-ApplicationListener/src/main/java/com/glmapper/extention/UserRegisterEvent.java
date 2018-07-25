package com.glmapper.extention;


import org.springframework.context.ApplicationEvent;

/**
 * @description: 用户注册事件
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/25
 */
public class UserRegisterEvent extends ApplicationEvent {

    public String name;

    public UserRegisterEvent(Object o) {
        super(o);
    }

    public UserRegisterEvent(Object o, String name) {
        super(o);
        this.name=name;
    }
}
