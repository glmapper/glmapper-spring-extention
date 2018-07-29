package com.glmapper.extention.beanfactoryaware.use;

import com.glmapper.extention.beanfactoryaware.GlmapperBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: MainTest
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/7/29
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloFacade helloFacade = (HelloFacade) context.getBean("helloFacade");

        GlmapperBeanFactory glmapperBeanFactory = (GlmapperBeanFactory) context.getBean("glmapperBeanFactory");
        //这里其实可以不通过set方法注入到helloFacade中，可以在helloFacade中通过autowired 注入；这里在使用main方法来执行验证，所以就手动set进入了
        helloFacade.setGlmapperBeanFactory(glmapperBeanFactory);

        //这个只需要传入不同HelloService的实现类的beanName，就可以执行不同的业务逻辑
        helloFacade.sayHello("glmapperHelloService");
        helloFacade.sayHello("leishuHelloService");
    }
}
