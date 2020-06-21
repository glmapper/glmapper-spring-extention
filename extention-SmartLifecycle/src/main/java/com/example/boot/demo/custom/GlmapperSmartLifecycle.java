package com.example.boot.demo.custom;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author: glmapper (glmapper_2018@163.com) 2019/9/16 10:58 PM
 * @since:
 **/
@Component
public class GlmapperSmartLifecycle implements SmartLifecycle {

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable runnable) {
        System.out.println("runnable stop........");
    }

    @Override
    public void start() {
        System.out.println("start........");
    }

    @Override
    public void stop() {
        System.out.println("runnable........");
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
