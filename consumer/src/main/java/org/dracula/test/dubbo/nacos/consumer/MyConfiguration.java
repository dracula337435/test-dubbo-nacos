package org.dracula.test.dubbo.nacos.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dk
 */
@Configuration
public class MyConfiguration {

    @Bean
    public NacosSpringValueAnnotationBeanPostProcessor nacosSpringValueAnnotationBeanPostProcessor(){
        return new NacosSpringValueAnnotationBeanPostProcessor();
    }

}
