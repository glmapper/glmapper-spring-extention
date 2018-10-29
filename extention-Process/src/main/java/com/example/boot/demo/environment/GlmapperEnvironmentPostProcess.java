package com.example.boot.demo.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 *
 * <p>
 *     EnvironmentPostProcessor在Spring IOC容器创建之前执行
 * </p>
 *
 * @author: guolei.sgl
 * @since: 18/10/28
 */
@Component
public class GlmapperEnvironmentPostProcess implements EnvironmentPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlmapperEnvironmentPostProcess.class);

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("GlmapperEnvironmentPostProcess begin to execute!");
        LOGGER.info("GlmapperEnvironmentPostProcess begin to execute!");
        InputStream inputStream = null;
        try {
            URL url = this.getClass().getClassLoader().getResource("glmapper.properties");
            File file = new File(url.getPath());
            inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my",properties);
            environment.getPropertySources().addLast(propertiesPropertySource);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
