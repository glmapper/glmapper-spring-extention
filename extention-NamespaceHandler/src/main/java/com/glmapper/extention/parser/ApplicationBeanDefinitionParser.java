package com.glmapper.extention.parser;

import com.glmapper.extention.support.ApplicationConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @description: BridgeBeanDefinitionParser
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: guolei.sgl
 * @date: 18/8/26
 */
public class ApplicationBeanDefinitionParser implements BeanDefinitionParser {

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(ApplicationConfig.class);
        beanDefinition.setLazyInit(false);
        String id = element.getAttribute("id");
        beanDefinition.getPropertyValues().add("id", id);
        beanDefinition.getPropertyValues().add("name", element.getAttribute("name"));
        beanDefinition.getPropertyValues().add("version", element.getAttribute("version"));
        beanDefinition.getPropertyValues().add("owner", element.getAttribute("owner"));
        beanDefinition.getPropertyValues().add("organization", element.getAttribute("organization"));
        parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);
        return beanDefinition;
    }
}
