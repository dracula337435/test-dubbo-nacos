package org.dracula.test.dubbo.nacos.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dk
 */
@SpringBootApplication
@DubboComponentScan
public class ConsumerMain {

    public static void main(String[] args){
        SpringApplication.run(ConsumerMain.class, args);
    }

}
