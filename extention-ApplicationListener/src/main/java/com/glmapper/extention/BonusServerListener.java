package com.glmapper.extention;

import org.springframework.context.ApplicationListener;

/**
 * @description: [描述文本]
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/25
 */
public class BonusServerListener implements ApplicationListener<UserRegisterEvent> {

    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("积分服务接到通知，给 " + event.getSource() + " 增加积分...");
    }
}
