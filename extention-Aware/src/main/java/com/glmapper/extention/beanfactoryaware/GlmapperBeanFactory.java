package com.glmapper.extention.beanfactoryaware;

import com.glmapper.extention.beanfactoryaware.use.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @description: 实现BeanFactoryAware ，让当前bean本身具有 BeanFactory 的能力
 *
 * 实现 BeanFactoηAware 接口的 bean 可以直接访问 Spring 容器，被容器创建以后，
 * 它会拥有一个指向 Spring 容器的引用，可以利用该bean根据传入参数动态获取被spring工厂加载的bean
 *
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/29
 */
public class GlmapperBeanFactory implements BeanFactoryAware {

    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
    }

    /**
     * 提供一个execute 方法来实现不同业务实现类的调度器方案。
     * @param beanName
     */
    public void execute(String beanName){
        HelloService helloService=(HelloService) beanFactory.getBean(beanName);
        helloService.sayHello();
    }

}
