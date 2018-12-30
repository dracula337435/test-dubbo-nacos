package org.dracula.test.dubbo.nacos.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.dracula.test.dubbo.nacos.TestInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Reference
    private TestInterface testInterface;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name){
        String sayHello = testInterface.sayHello(name);
        logger.info("in controller, "+sayHello);
        return sayHello;
    }

}
