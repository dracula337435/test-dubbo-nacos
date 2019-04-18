package org.dracula.test.dubbo.nacos.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * @author dk
 */
@SpringBootApplication
@DubboComponentScan
@NacosPropertySource(dataId = "example", autoRefreshed = true)
@EnableConfigurationProperties({TestProperites.class, TestAutoRefreshedProperties.class})
@ImportResource("classpath:org/dracula/test/dubbo/nacos/consumer/another.xml")
public class ConsumerMain {

    public static void main(String[] args){
        SpringApplication.run(ConsumerMain.class, args);
    }

}
