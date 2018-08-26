package com.glmapper.extention.namespacehandler;

import com.glmapper.extention.parser.ApplicationBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @description: BridgeNamespaceHandler
 * @email: <a href="guolei.sgl@antfin.com"></a>
 * @author: guolei.sgl
 * @date: 18/8/26
 */
public class BridgeNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("application", new ApplicationBeanDefinitionParser());
    }

}
