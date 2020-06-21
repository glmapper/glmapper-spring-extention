package com.glmapper.extention;

import org.springframework.context.ApplicationEvent;

/**
 * @description: [描述文本]
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/8/19
 */
public class UserLoginEvent extends ApplicationEvent {

    public String name;

    public UserLoginEvent(Object o) {
        super(o);
    }

    public UserLoginEvent(Object o, String name) {
        super(o);
        this.name = name;
    }
}
