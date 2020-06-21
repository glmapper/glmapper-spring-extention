package com.example.boot.demo.factorybean;

import com.example.boot.demo.model.TestModel;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: glmapper (glmapper_2018@163.com) 2020/6/21 8:52 PM
 * @since:
 **/
@Component
public class GlmapperFactoryBean implements FactoryBean<TestModel> {

    @Override
    public TestModel getObject() throws Exception {
        return new TestModel();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
