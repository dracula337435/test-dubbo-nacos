package org.dracula.test.dubbo.nacos.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dk
 */
@SpringBootApplication
@DubboComponentScan
public class ProviderMain {

    public static void main(String[] args){
        SpringApplication.run(ProviderMain.class, args);
    }

}
