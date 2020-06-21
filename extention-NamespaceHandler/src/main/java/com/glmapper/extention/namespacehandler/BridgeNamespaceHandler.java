package com.glmapper.extention.namespacehandler;

import com.glmapper.extention.parser.ApplicationBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @description: BridgeNamespaceHandler
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/8/26
 */
public class BridgeNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("application", new ApplicationBeanDefinitionParser());
    }

}
